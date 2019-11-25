package day28jdbc;

import java.sql.SQLException;

public class Demo07test {
	public static void main(String[] args) throws SQLException {
		String sql="select * from ming";
		DemoJDBC07.myselect(DemoJDBC07.getConnection(), sql, null);
	}
}
