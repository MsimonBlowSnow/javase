package day28jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*ģ���¼��ѯ��
 	*����ʾsqlע�� 
 *sqlע��
 	*�ڱ�ʵ��������statement����¼(�п���sqlע��)
 	*�û��������
 	*����ǰ����һ���� ����� or ��a��=��a ����
 *"select * from user where user='"
					+XXX��+"'and password='"+afdafa' or 'a' ='a+"';"
 * */
public class Demo02LoginSql {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection aConnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabases","root","123456");
		Scanner scanner= new Scanner(System.in);
		String passordString=null;
		String userString=null;
		//�÷��������п���sqlע��
		Statement aStatement=aConnection.createStatement();
		ResultSet aResultSet=null;
		int times=3;
		while(times!=0){
			if(times!=3) {
				System.out.println("�㻹��"+times+"�λ���!");
			}
			System.out.println("����������˺�:");
			userString=scanner.nextLine();
			System.out.println("�������������:");
			passordString=scanner.nextLine();
			aResultSet=aStatement.executeQuery("select * from user where user='"
					+userString+"'and password='"+passordString+"';");
			if(aResultSet.next()) {
				System.out.println("��¼�ɹ�");break;
			}
			times--;
		}
		if(times==0) {
			System.out.println("��¼ʧ��!");
		}
		aResultSet.close();
		aStatement.close();
		aConnection.close();
	}
}
