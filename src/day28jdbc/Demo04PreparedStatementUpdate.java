package day28jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*用prestatement完成update
 * */
public class Demo04PreparedStatementUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection aConnection=DriverManager.getConnection("jdbc:mysql://localhost/mydatabases","root","123456");
		String sqlString="update ming set age=?,sex1=?,name1=? where ID=1;";
		PreparedStatement aPreparedStatement=aConnection.prepareStatement(sqlString);
		aPreparedStatement.setInt(1, 20);
		aPreparedStatement.setString(2,"男");
		aPreparedStatement.setString(3, "明");
		int a=aPreparedStatement.executeUpdate();
		if(a==1)
			System.out.println("成功");
		else {
			System.out.println("失败");
		}
		aPreparedStatement.close();
		aConnection.close();
	}
}
