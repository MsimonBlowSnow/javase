package day28jdbc;
/*
JDBC操作数据库的步骤
1.注册驱动
    告知JVM使用的是哪一个数据库的驱动
2.获得连接
   使用JDBC中的类,完成对MySQL数据库的连接
3.获得语句执行平台
  通过连接对象获取对SQL语句的执行者对象
4.执行sql语句
  使用执行者对象,向数据库执行SQL语句
  获取到数据库的执行后的结果
5.处理结果
6.释放资源  一堆close()
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