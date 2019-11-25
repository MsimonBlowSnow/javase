package day28jdbc;

/*1.问题解决:
 	*config.propertie文件的获取，不能直接获取src/config.propertie,
 	*因为给用户的只有bin文件，不过在src里面的文件在创建的时候会自动给bind一份
 	*解决:
 		*通过类的加载器来加载
 		* InputStream aInputStream=JDBCUitlNew.class.getClassLoader().getResourceAsStream("config.propertie");
			Properties aProperties=new Properties();
			aProperties.load(aInputStream);
			String  driverClass=aProperties.getProperty("driverClass");
			String url=aProperties.getProperty("url");
			String user=aProperties.getProperty("user");
			String Password=aProperties.getProperty("password");
			Class.forName(driverClass);
*config创建问题
	*描述:
		*config.propertie文件应该创建在src下面，通过eclipse会帮你拷贝到bin里面
		*执行的是bin里面的文件			
 * */
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class JDBCUitlNew {
	//私有化构造方法
	private static Connection con;
	private static  String driverClass;
	private static String url;
	private static String  user;
	private static String password;
	
	private void JDBCUitlNew() {}
	
	static{
		InputStream aInputStream=JDBCUitlNew.class.getClassLoader().getResourceAsStream("config.propertie");
		Properties aProperties=new Properties();
		try {
			aProperties.load(aInputStream);
			 readConfig(aProperties);
			Class.forName(driverClass);
			con = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readConfig(Properties aProperties) {
		driverClass=aProperties.getProperty("driverClass");
		 url=aProperties.getProperty("url");
		 user=aProperties.getProperty("user");
		 password=aProperties.getProperty("password");
	}
	
	public static Connection getConnection() {
		return con;
	}
	
	public static void close(Connection con, Statement st) {
		if(con!=null) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(st!=null) {
			try {
				st.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(Connection con,Statement  st,ResultSet rs){
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(st!=null)
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
