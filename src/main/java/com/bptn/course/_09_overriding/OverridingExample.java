package com.bptn.course._09_overriding;


/*
 * Overriding is a type of Polymorphism - Poly: Many, Morphism: Forms
 * 
 * Overriding is the situation when a Child has a method with the same name and
 * parameters as the Parent class.
 * 
 * The @Override annotation is an informative annotation that checks if the annotated
 * method name and parameters exists in the parent class.
 * 
 * The @Override annotation is not mandatory to use, but it is very helpful as it
 * makes the code more readable and it also checks if the method exists in the parent class.
 * 
 * Overriding only happens with methods.
 * 
 * Every class has Object as a superclass.
 * Class Object is the root of the class hierarchy. 
 * 
 * The System.out.println() method calls the toString() method of the object automatically.
 * But it prints essencially the hashcode of the object in the JVM plus the package and class name which are not relevant.
 * 
 *    getClass().getName() + '@' + Integer.toHexString(hashCode())
 *    
 * So when necessary we should override the toString() by customizing it to print out more 
 * relevant information.
 * 
 */

class Person extends Object{
	
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
	
	void display() {
		System.out.println("Person: " + name + " , age " + age);
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
	
	@Override
	void display() {
		System.out.println("Employee: " + id + " ,name " + getName() + " , age " + getAge());
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, salary=%s, position=%s, getName()=%s, getAge()=%s]", id, salary,
				position, getName(), getAge());
	}
	
	

}

public class OverridingExample {

	public static void main(String[] args) {
		Employee emp = new Employee(1010,"John",30,100_000,"Manager");
		
		//emp.display();
		
		System.out.println(emp); // Invokes the toString() automatically. 

		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
