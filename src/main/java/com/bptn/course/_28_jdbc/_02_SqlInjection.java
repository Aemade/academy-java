package com.bptn.course._28_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_SqlInjection {

	public static void main(String[] args) {
		
		String dbURL = "jdbc:postgresql://localhost:5432/bptn";
		String dbUsername = "postgres";
		String dbPassword = "pg123";
		
		// Good Data
//		String name = "Charlie";
//		int age = 35;
		
		// Bad Data
		String name = "'Charlie'; DELETE FROM employee;--";
		
		
		
		
//		String sql = "INSERT INTO employee (name, age) VALUES ('" + name + "', " + age + ")";
		String sql = "SELECT * FROM employee WHERE name = " + name ;
		
		System.out.println(sql);
		
		
		try(Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);) {
			
					
			
		} catch (SQLException e) {
			e.printStackTrace();
		

	}
		
	}

}
