package day28jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

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
public class Demo01jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		/*Driver 在驱动包里面,里面有一个静态代码块，会自动创建用下面的方法就创作了两个Driver();
		不太提倡下面的方法注册，应该用Class.forName("");来注册
		DriverManager.registerDriver(new  Driver());  */
		
		//获得数据库的连接
		//getConnection(string url,String user,String password)
		//url的写法:jdbc:mysql://localhost:3306/数据库名
		Connection aConnection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabases", "root",
				"123456");
		//Connection 的对象调用createStatement();方法，可以获得Statement对象
		//Statement是java中的接口，不过他的实现类在jdbc里面
		Statement aStatement = aConnection.createStatement();
		//System.out.println(aConnection);//输出statement实现类对象的对象
		
		//aStatement.executeUpdate(sql)对delete insert update 有效，返回int
		ResultSet aResultSet = aStatement.executeQuery("select * from ming");
		int age = 0;
		String sex = null;
		int ID = 0;
		String nameString = null;
		while (aResultSet.next()) {
			//getXXX(int indexof)获取对应索引上的值
			//getXXX(String name)获取对应名字的值
			//建议使用getXXX(String name)(可以用getSting或者getbject代替);
			age = aResultSet.getInt(1);
			sex = aResultSet.getString("sex1");
			ID = aResultSet.getInt(3);
			nameString = aResultSet.getString(4);
			System.out.println("age: " + age + " sex: " + sex + " ID: " + ID + " nameString: " + nameString);
		}
		//关闭资源
		aResultSet.close();
		aStatement.close();
		aConnection.close();
	}
}
