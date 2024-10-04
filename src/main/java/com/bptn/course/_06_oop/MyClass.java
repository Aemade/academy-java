package com.bptn.course._06_oop;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		String str1 = "Hello";
		
		/*
		 * emp1:
		 * Object of class Employee
		 * Instance of class Employee
		 * Local variable
		 * 
		 * new is a keyword used to allocate memory
		 */
		
		Scanner scan = new Scanner(System.in);
	
		/*
		 * 1. Direct - not recommended
		 */
		
		Employee emp1 = null; //new Employee();
		// Breaking Encapsulation (OOP Concepts)
		//emp1.id = 1010;
		//emp1.name = "John";
		//emp1.salary = 80_000;
		//emp1.position = "manager";

		emp1.display();
		double bonus = emp1.calculateBonus(8);
		
		//double total = emp1.salary + bonus;
		
		//System.out.println(total);
		
		System.out.println("*******");
		
		/*
		 * 2. Getters and Setters.
		 */
		
		Employee emp2 = new Employee();
		emp2.setId(1020); 
		emp2.setName("Jane");
		emp2.setSalary(90_000);
		emp2.setPosition("accountant");
		
		emp2.display();
		bonus = emp2.calculateBonus(10);
		
		double total = emp2.getSalary() + bonus;
		
		System.out.println(total);		
		
		/*
		 * 3. Parameterized Constructor 
		 */
		
		Employee emp3 = new Employee(1030,"Mike",100_000, "director");
		
		
		emp3.display();
		bonus = emp3.calculateBonus(7);
		
		total = emp3.getSalary() + bonus;
		
		System.out.println(total);		
		
		
		Employee emp4 = new Employee(1040,"Tony");
	
		emp2.setSalary(90_000);
		emp2.setPosition("analyst");	
		
		
		
		

	}

}
