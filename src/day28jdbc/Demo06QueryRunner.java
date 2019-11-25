package day28jdbc;
/* 使用BDutil 里面的QureyRunner 来查找数据库的
	delete insert update
	使用QueryRunner类中的update(Connection conn,String sql,Object...param)
	Object... 为可变参数
*/

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

public class Demo06QueryRunner {
	public static int query() throws SQLException{
		QueryRunner aQueryRunner = new QueryRunner();
		Connection conn = JDBCUitlNew.getConnection();
		String sqlUpdate = "update ming set name1=? where ID=?";
		int flag=aQueryRunner.update(conn, sqlUpdate, new Object[] { "mings",1});
		DbUtils.closeQuietly(conn);
		return flag;
	}
	public static void insert() throws SQLException {
		QueryRunner aQueryRunner = new QueryRunner();
		Connection conn = JDBCUitlNew.getConnection();
		String sqlUpdate = "insert into ming values(?,?,?,?)";
		int flag=aQueryRunner.update(conn, sqlUpdate, new Object[] {111,"男",8,"mings"});
		DbUtils.closeQuietly(conn);
	}
	
	//如果想判断判断返回的结果是1还是0
	public static int delete() throws SQLException {
		QueryRunner aQueryRunner = new QueryRunner();
		Connection conn = JDBCUitlNew.getConnection();
		String sqlUpdate = "delete from ming where ID=?";
		int flag=aQueryRunner.update(conn, sqlUpdate, new Object[] {7});
		DbUtils.closeQuietly(conn);
		return flag;
	}
}
