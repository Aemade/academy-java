package com.bptn.course._28_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.bptn.course._28_jdbc.bean.Student;

public class _05_PrStInsert {

public static void main(String[] args) {
		
		String dbURL = "jdbc:postgresql://localhost:5432/bptn";
		String dbUsername = "postgres";
		String dbPassword = "postgres";
		
		Student student = new Student();
		
		
		String sql = "INSERT INTO students (\"studentName\",\"courseId\",  \"studentEmail\", \"studentPhone\") "
				+ "VALUES(?, ?, ?, ?)";
				
				//"SELECT * FROM students WHERE \"studentName\"= ?";   //  studentName  "studentName"

		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Enter courseId : ");
			student.setCourseId(scanner.nextInt());
			scanner.nextLine(); // flush the buffer
			
			System.out.println("Enter student Name: ");
			student.setStudentName(scanner.nextLine());
			
			System.out.println("Enter student Email: ");
			student.setStudentEmail(scanner.nextLine());
			
			System.out.println("Enter student Phone: ");
			student.setStudentPhone(scanner.nextLine());
			
		}
		
		//sql = sql + input; // This is the SQL Injection point
		
		System.out.println("Sql to be executed: " + sql);
		System.out.println("Student to be inserted: " + student);
		
		// Try with resources, resources are automatically closed
		try(Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			
			// Set the parameter for each question mark in the SQL statement
			st.setInt(1, student.getCourseId());
			st.setString(2, student.getStudentName());
			st.setString(3, student.getStudentEmail());
			st.setString(4, student.getStudentPhone());
			
			int affectedRows = st.executeUpdate();
			
			System.out.println("Affected Rows: " + affectedRows);
			
			try(ResultSet rs = st.getGeneratedKeys()){
				if (rs.next()) {
					
					student.setStudentId(rs.getInt(1));
                    System.out.println("Student created: " + student);	
                    
                }
            }
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
