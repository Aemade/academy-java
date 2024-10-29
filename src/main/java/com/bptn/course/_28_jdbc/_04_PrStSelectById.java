package com.bptn.course._28_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.bptn.course._28_jdbc.bean.Student;

public class _04_PrStSelectById {

public static void main(String[] args) {
		
		String dbURL = "jdbc:postgresql://localhost:5432/bptn";
		String dbUsername = "postgres";
		String dbPassword = "postgres";
		
		Student student = new Student();
		
		
		String sql = "SELECT * FROM students WHERE \"studentName\"= ?";   //  studentName  "studentName"

		/*
		 * Concatenating values to the SQL string allows SQL Injection Attacks.
		 * For instance: 0 OR "studentEmail"='michael.davis@hotmail.com'
		 * 
		 * That's why in real life we use PreparedStatements instead of Statements,
		 * specially if we need to concatenate values.
		 * 
         * Benefits of PreparedStatements
         * 
         * 1. Avoids SQL Injection Attacks
         * 2. Precompile the SQL Statement. They run faster.
		 *
		 */
		String input = null;
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Enter student Name: ");
			input = scanner.nextLine();
		}
		
		//sql = sql + input; // This is the SQL Injection point
				
		// Try with resources, resources are automatically closed
		try(Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			PreparedStatement st = con.prepareStatement(sql)) {
			
			// Set the parameter for the question mark in the SQL statement
			st.setString(1, input);
			
			try(ResultSet rs = st.executeQuery();){
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
                    
                    System.out.println("Student found: " + student);	
                    
                }
                else {
                    System.out.println("No student found with id: " + input);
                }
            }
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
