package day28jdbc;
/* ʹ��BDutil �����QureyRunner ���������ݿ��
	delete insert update
	ʹ��QueryRunner���е�update(Connection conn,String sql,Object...param)
	Object... Ϊ�ɱ����
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
		int flag=aQueryRunner.update(conn, sqlUpdate, new Object[] {111,"��",8,"mings"});
		DbUtils.closeQuietly(conn);
	}
	
	//������ж��жϷ��صĽ����1����0
	public static int delete() throws SQLException {
		QueryRunner aQueryRunner = new QueryRunner();
		Connection conn = JDBCUitlNew.getConnection();
		String sqlUpdate = "delete from ming where ID=?";
		int flag=aQueryRunner.update(conn, sqlUpdate, new Object[] {7});
		DbUtils.closeQuietly(conn);
		return flag;
	}
}
