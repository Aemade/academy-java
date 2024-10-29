package com.bptn.course._28_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.bptn.course._28_jdbc.bean.Student;

public class _03_StmtSelectById {

public static void main(String[] args) {
		
		String dbURL = "jdbc:postgresql://localhost:5432/bptn";
		String dbUsername = "postgres";
		String dbPassword = "postgres";
		
		Student student = new Student();
		
		
		String sql = "SELECT * FROM students WHERE \"studentId\"=";   //  studentName  "studentName"

		/*
		 * Concatenating values to the SQL string allows SQL Injection Attacks.
		 * For instance: 0 OR "studentEmail"='michael.davis@hotmail.com'
		 * 
		 * That's why in real life we use PreparedStatements instead of Statements,
		 * specially if we need to concatenate values.
		 */
		String input = null;
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Enter student id: ");
			input = scanner.nextLine();
		}
		
		sql = sql + input; // This is the SQL Injection point
				
		// Try with resources, resources are automatically closed
		try(Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);) {
			
			if (rs.next()) {
								
				int studentId = rs.getInt("studentId");
				int courseId = rs.getInt("courseId");
				String studentName = rs.getString("studentName");
				String studentEmail = rs.getString("studentEmail"); 
				String studentPhone = rs.getString("studentPhone");
				
				
				student.setStudentId(studentId);
				student.setCourseId(courseId);
				student.setStudentName(studentName);
				student.setStudentEmail(studentEmail);
				student.setStudentPhone(studentPhone);
				
				System.out.println(student);	
				
			}
			else {
				System.out.println("No student found with id: " + input);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
