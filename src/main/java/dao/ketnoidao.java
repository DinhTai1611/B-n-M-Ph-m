package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ketnoidao {
	public Connection cn;

	public void ketnoi() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("ok");
		String url = "jdbc:sqlserver://DESKTOP-FF1278R\\SQLEXPRESS:1433;databaseName=QLSkincare;user=sa; password=123";
		cn = DriverManager.getConnection(url);
		System.out.println("ok ok ok");
	}
}
