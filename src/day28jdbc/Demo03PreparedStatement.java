package day28jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*statement ��sqlע��ķ��ա�
 *prepareStatement��ɵ�¼  
 * 
 * */
public class Demo03PreparedStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//����������
		Class.forName("com.mysql.jdbc.Driver");
		
		//��ȡ���Ӷ���
		Connection aConnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabases","root","123456");
		//PreparedStatement���Է�ֹsqlע�룬Statement���ӽӿ�
		PreparedStatement aPreparedStatement=aConnection.prepareStatement("select * from user where user=? and password=?");
		aPreparedStatement.setString(1, "ming");
		aPreparedStatement.setString(2, "aaa");
		ResultSet aResultSet=aPreparedStatement.executeQuery();
		if(aResultSet.next()) {
			System.out.println("��¼�ɹ�!");
			System.out.println(aResultSet.getObject(1)+" "+aResultSet.getObject(2));
		}else {
			System.out.println("��Ƿ���¼������Ĵ������!");
		}
		aResultSet.close();
		aPreparedStatement.close();
		aConnection.close();
	}
}
