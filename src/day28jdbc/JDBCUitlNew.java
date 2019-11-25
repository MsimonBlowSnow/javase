package day28jdbc;

/*1.������:
 	*config.propertie�ļ��Ļ�ȡ������ֱ�ӻ�ȡsrc/config.propertie,
 	*��Ϊ���û���ֻ��bin�ļ���������src������ļ��ڴ�����ʱ����Զ���bindһ��
 	*���:
 		*ͨ����ļ�����������
 		* InputStream aInputStream=JDBCUitlNew.class.getClassLoader().getResourceAsStream("config.propertie");
			Properties aProperties=new Properties();
			aProperties.load(aInputStream);
			String  driverClass=aProperties.getProperty("driverClass");
			String url=aProperties.getProperty("url");
			String user=aProperties.getProperty("user");
			String Password=aProperties.getProperty("password");
			Class.forName(driverClass);
*config��������
	*����:
		*config.propertie�ļ�Ӧ�ô�����src���棬ͨ��eclipse����㿽����bin����
		*ִ�е���bin������ļ�			
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
	//˽�л����췽��
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
