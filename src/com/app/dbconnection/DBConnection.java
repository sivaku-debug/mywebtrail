package com.app.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static Connection con;
	
	public static Connection  con() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myownbusiness", "root", "root");
			
			System.out.println("db connected");
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return con;
		
	}
	
}
