package day28jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo05PrepareStatementSelect {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection aConnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabases","root","123456");
		String sqlString="select * from ming";
		PreparedStatement aPreparedStatement=aConnection.prepareStatement(sqlString);
		ResultSet aResultSet=aPreparedStatement.executeQuery();
		while(aResultSet.next()) {
			System.out.println("age:"+aResultSet.getInt("age")+" sex:"+
				aResultSet.getObject("sex1")+" ID:"+aResultSet.getObject("ID")+" name:"+aResultSet.getObject("name1"));
		}
		aResultSet.close();
		aPreparedStatement.close();
		aConnection.close();
	}
}
