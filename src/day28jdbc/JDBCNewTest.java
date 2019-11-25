package day28jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCNewTest {
	public static void main(String[] args) throws SQLException {
		Connection con=JDBCUitlNew.getConnection();
		System.out.println(con);
		JDBCUitlNew.close(con,null);
		System.out.println(con);
		String sql="select * from ming;";
		PreparedStatement aPreparedStatement=con.prepareStatement(sql);
	}
}
