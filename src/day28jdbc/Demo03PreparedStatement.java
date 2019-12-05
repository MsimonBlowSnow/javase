package day28jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*statement 有sql注入的风险。
 *prepareStatement完成登录  
 * 
 * */
public class Demo03PreparedStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//加载驱动类
		Class.forName("com.mysql.jdbc.Driver");
		
		//获取连接对象
		Connection aConnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabases","root","123456");
		//PreparedStatement可以防止sql注入，Statement的子接口
		PreparedStatement aPreparedStatement=aConnection.prepareStatement("select * from user where user=? and password=?");
		aPreparedStatement.setString(1, "ming");
		aPreparedStatement.setString(2, "aaa");
		ResultSet aResultSet=aPreparedStatement.executeQuery();
		if(aResultSet.next()) {
			System.out.println("登录成功!");
			System.out.println(aResultSet.getObject(1)+" "+aResultSet.getObject(2));
		}else {
			System.out.println("想非法登录，作你的春秋大梦!");
		}
		aResultSet.close();
		aPreparedStatement.close();
		aConnection.close();
	}
}
