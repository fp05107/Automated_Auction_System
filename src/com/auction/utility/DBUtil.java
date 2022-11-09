package com.auction.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection provideConnection() {
		
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		try {
			conn = DriverManager.getConnection(url,"root","subham@1234");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return conn;
	}
	public static void main(String[] args) {
		
		int i = 07;
		System.out.println(i);
	}
}
