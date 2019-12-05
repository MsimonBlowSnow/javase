package day28jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class TestJDBCUtil {
	public static void main(String[] args) throws SQLException {
		//创建一个集合保存ResultSet的结果
		List<JDBCHelpMing> alist=new ArrayList<JDBCHelpMing>();
		
		//通过JDBCUtil获取连接对象
		Connection connection=JDBCUtil.getConnection();
		String sqlString="select * from ming";
		//创建PreparedStatement
		PreparedStatement aPreparedStatement= connection.prepareStatement(sqlString);
		ResultSet rSet=aPreparedStatement.executeQuery();
		while (rSet.next()) {
			JDBCHelpMing aMing=new JDBCHelpMing(rSet.getString("name1"),rSet.getInt("age"),
					rSet.getString("sex1"),rSet.getInt("ID")
					);
			alist.add(aMing);
		}
		for (JDBCHelpMing jdbcHelpMing : alist) {
			System.out.println(jdbcHelpMing);
		}
		JDBCUtil.close(connection,aPreparedStatement,rSet);
	}
}