package com.bptn.course._00_instructor_led;
//Week 2 Monday

public class Person01 {
	   // instance variables
	   private String name;
	   private String email;
	   private String phoneNumber;

	   // constructor: construct a Person copying in the data into the instance variables
	   public Person01(String initName, String initEmail, String initPhone) {
	      name = initName;
	      email = initEmail;
	      phoneNumber = initPhone;
	   }

	   // Print all the data for a person
	   public void print() {
	     System.out.println("Name: " + name);
	     System.out.println("Email: " + email);
	     System.out.println("Phone Number: " + phoneNumber);
	   }

	   // main method for testing
	   public static void main(String[] args) {
	      // call the constructor to create a new person
	      Person01 p1 = new Person01("Sana", "sana@gmail.com", "123-456-7890");
	      // call p1's print method
	      p1.print();
	      Person01 p2 = new Person01("Jean", "jean@gmail.com", "404 899-9955");
	      p2.print();
	   }
	}


