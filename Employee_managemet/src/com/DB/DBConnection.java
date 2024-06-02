package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	
	public static Connection connection = null;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306?";
			String user = "root";
			String password = "admin";
			connection = DriverManager.getConnection(url, user, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
