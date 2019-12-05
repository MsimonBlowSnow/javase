package day28jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*模拟登录查询，
 	*并演示sql注入 
 *sql注入
 	*在本实例中用来statement来登录(有可能sql注入)
 	*用户名任意打
 	*密码前面有一个‘ 后面加 or ’a‘=’a 即可
 *"select * from user where user='"
					+XXX‘+"'and password='"+afdafa' or 'a' ='a+"';"
 * */
public class Demo02LoginSql {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection aConnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabases","root","123456");
		Scanner scanner= new Scanner(System.in);
		String passordString=null;
		String userString=null;
		//该方法不好有可能sql注入
		Statement aStatement=aConnection.createStatement();
		ResultSet aResultSet=null;
		int times=3;
		while(times!=0){
			if(times!=3) {
				System.out.println("你还有"+times+"次机会!");
			}
			System.out.println("请输入你的账号:");
			userString=scanner.nextLine();
			System.out.println("请输入你的密码:");
			passordString=scanner.nextLine();
			aResultSet=aStatement.executeQuery("select * from user where user='"
					+userString+"'and password='"+passordString+"';");
			if(aResultSet.next()) {
				System.out.println("登录成功");break;
			}
			times--;
		}
		if(times==0) {
			System.out.println("登录失败!");
		}
		aResultSet.close();
		aStatement.close();
		aConnection.close();
	}
}
