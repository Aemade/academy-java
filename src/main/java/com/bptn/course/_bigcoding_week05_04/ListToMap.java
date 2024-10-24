package com.bptn.course._bigcoding_week05_04;

	import java.util.List;
	import java.util.ArrayList;
	import java.util.Map;
	import java.util.stream.Collectors;

	public class ListToMap {

	    // create static method "convertStudentListToMap"
	public static Map<Integer, Student> convertStudentListToMap(List<Student> students) {
	         Map<Integer, Student> studentMap = students.stream()
	                .collect(Collectors.toMap(Student::getId, student -> student));
	        return studentMap;
	    }

	    // Complete the main method
	    public static void main(String[] args) {

	        // Create a list of students
	     List<Student> students = new ArrayList<>();    
	        
	        //add student objects to this list
	        students.add(new Student(1, "Alice", 20));
	        students.add(new Student(2, "Bob", 22));
	        students.add(new Student(3, "Charlie", 21));    

	        // Call "convertStudentListToMap" method and hold the returned value in "studentMap" variable.
	    Map<Integer, Student> studentMap = convertStudentListToMap(students);
	   
	        // Print the map
	        System.out.println("Students Map: "+ studentMap);
	    }
	}
	
	/*
	The code has successfully convert the List into a Map with the student ID as the key and student object as the value. 

	Applying method references (e.g., Student::getId) and lambda expressions 
	(e.g., student -> student) was a significant part of this task, as they are crucial when working 
	with Java Streams.

	I had a challenge to properly set this line of code
	 Map<Integer, Student> studentMap = students.stream()
	                .collect(Collectors.toMap(Student::getId, student -> student));
	        return studentMap;

	its mainly due to missing/error on streams and Collectors.
	*/