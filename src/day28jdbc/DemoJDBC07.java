package day28jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;


public class DemoJDBC07 {
	private static Connection conn;
	static{
		InputStream iStream=DemoJDBC07.class.getClassLoader().getResourceAsStream("config.propertie");
		Properties aProperties=new Properties();
		try {
			aProperties.load(iStream);
			String driver =aProperties.getProperty("driverClass");
			String url= aProperties.getProperty("url");
			String user =aProperties.getProperty("user");
			String password=aProperties.getProperty("password");
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return conn;
	}
	
	public static void myUpdate(Connection con,String sql,Object... params) throws SQLException{
		QueryRunner aQueryRunner=new QueryRunner();
		aQueryRunner.update(con, sql, params);
	}
	public static void myselect(Connection con,String sql,Object... params) throws SQLException {
		QueryRunner aQueryRunner =new QueryRunner();
		//只返回查询到的第一个数据，并返回
		/*Object[] aObjects=aQueryRunner.query(con, sql, params,new ArrayHandler());
		for (Object object : aObjects) {
			System.out.println(object);
		}*/
		//ArrayListhandler返回一个Object数组的list,包括所有信息
		/*List<Object[]> alist=aQueryRunner.query(con,sql,params,new ArrayListHandler());
		for (Object[] objects : alist) {
			for (Object objects2 : objects) {
				System.out.print(objects2 +" \t");
			}
			System.out.println();
		}*/
		//BeanHandler返回数据库里面第一条的数据的MingBean，如果MingBean没有空参数构造方法，会报错
		MingBean a=aQueryRunner.query(con, sql, new BeanHandler<MingBean>(MingBean.class));
		System.out.println(a);
	}
}
