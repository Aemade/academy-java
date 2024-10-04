package com.bptn.course._08_inheritance;

/*
 * Inheritance is when a class acquires the elements (attributes and methods) of
 * another class to reuse code.
 * 
 * The class that the other class inherits from is called: Parent / Super Class / Base
 * The class that inherits is called: Child / Sub Class / Derived
 * 
 * The Parent can be inherited multiple times.
 * The Child can ONLY have one Parent class. (Multiple-Inheritance is not possible in Java)
 * 
 * Multi-level Inheritance is allowed (Parent/Child/GrandChild)
 * 
 * The Child doesn't inherit private elements of the Parent (attributes and methods)
 * The Child has access to the private attributes of the parent class through getters and setters. 
 * The Goal of inheritance is to reuse code (DRY - Don't repeat yourself)
 */

class Person{
	
	private String name;
	int age;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	private void display() {
		System.out.println(name);
	}

	void display(String str) {
		System.out.println(str + " " + name);
	}
}


class Employee extends Person {
	
	int id;	
	double salary;
	String position;
	
	Employee(){}
	
	Employee(int id, String name, int age, double salary, String position) {
		this.id = id;
		this.salary = salary;
		this.position = position;
		//this.name = name;
		this.setName(name);
		this.age = age;
	}
		
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	String getPosition() {
		return position;
	}
	void setPosition(String position) {
		this.position = position;
	}	
	
}

class CustomerServiceEmployee extends Employee {
	
	
}

class Contractor extends Person{
	
}


public class InheritanceExample {

	public static void main(String[] args) {

		Employee emp = new Employee(1010,"John",30,100_000,"Manager");
		
		emp.display("Hello");
//		emp.setId(1010);
//		emp.setName("John");
//		emp.setAge(30);
//		emp.setSalary(100_000);
//		emp.setPosition("Manager");
//		
	}

}
