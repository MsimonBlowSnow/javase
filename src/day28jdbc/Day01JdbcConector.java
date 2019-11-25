package day28jdbc;
/*
JDBC�������ݿ�Ĳ���
1.ע������
    ��֪JVMʹ�õ�����һ�����ݿ������
2.�������
   ʹ��JDBC�е���,��ɶ�MySQL���ݿ������
3.������ִ��ƽ̨
  ͨ�����Ӷ����ȡ��SQL����ִ���߶���
4.ִ��sql���
  ʹ��ִ���߶���,�����ݿ�ִ��SQL���
  ��ȡ�����ݿ��ִ�к�Ľ��
5.������
6.�ͷ���Դ  һ��close()
*/
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
public class Day01JdbcConector {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabases", "root", "123456");
			System.out.print("yes");
			Statement statement=con.createStatement();
			String str= "select * from ming";
			ResultSet rsResultSet=statement.executeQuery(str);
			int age;
			String sex;
			String nameString;
			int ID;
			while(rsResultSet.next()) {
				age=rsResultSet.getInt(1);
				sex=rsResultSet.getString(2);
				nameString=rsResultSet.getString(4);
				ID= rsResultSet.getInt(3);
				System.out.println("age:"+age+"sex:"+sex+"name:"+nameString+"ID:"+ID);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			 System.out.print("no");
			e.printStackTrace();
		}
	}
}