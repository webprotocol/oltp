package com.example;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleExample {
	
	public static void main(String[] args) throws SQLException {
//		String url = "jdbc:oracle:thin:@orcl_high?TNS_ADMIN=C:/opt/Wallet_orcl";
		String url = "jdbc:oracle:thin:@orcl_high?TNS_ADMIN=/opt/Wallet_orcl";
		String user = "admin";
		String password = "xxx";
		
		var conn = DriverManager.getConnection(url, user, password);
		
		var stmt = conn.createStatement();
		
		var rs = stmt.executeQuery("select * from dept");
		
		while(rs.next()) {
			Integer deptno = rs.getInt(1);
			String dname = rs.getString(2);
			String loc = rs.getString(3);
			System.out.printf("[%d,%s,%s]\n", deptno, dname, loc);
		}
				
	}

}
