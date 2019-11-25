package day28jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

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
public class Demo01jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//��������
		Class.forName("com.mysql.jdbc.Driver");
		/*Driver ������������,������һ����̬����飬���Զ�����������ķ����ʹ���������Driver();
		��̫�ᳫ����ķ���ע�ᣬӦ����Class.forName("");��ע��
		DriverManager.registerDriver(new  Driver());  */
		
		//������ݿ������
		//getConnection(string url,String user,String password)
		//url��д��:jdbc:mysql://localhost:3306/���ݿ���
		Connection aConnection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabases", "root",
				"123456");
		//Connection �Ķ������createStatement();���������Ի��Statement����
		//Statement��java�еĽӿڣ���������ʵ������jdbc����
		Statement aStatement = aConnection.createStatement();
		//System.out.println(aConnection);//���statementʵ�������Ķ���
		
		//aStatement.executeUpdate(sql)��delete insert update ��Ч������int
		ResultSet aResultSet = aStatement.executeQuery("select * from ming");
		int age = 0;
		String sex = null;
		int ID = 0;
		String nameString = null;
		while (aResultSet.next()) {
			//getXXX(int indexof)��ȡ��Ӧ�����ϵ�ֵ
			//getXXX(String name)��ȡ��Ӧ���ֵ�ֵ
			//����ʹ��getXXX(String name)(������getSting����getbject����);
			age = aResultSet.getInt(1);
			sex = aResultSet.getString("sex1");
			ID = aResultSet.getInt(3);
			nameString = aResultSet.getString(4);
			System.out.println("age: " + age + " sex: " + sex + " ID: " + ID + " nameString: " + nameString);
		}
		//�ر���Դ
		aResultSet.close();
		aStatement.close();
		aConnection.close();
	}
}
