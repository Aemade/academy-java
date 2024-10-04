package com.bptn.course._06_oop;

/*
 * A Class is like a construction map, blueprint or template for creating objects( allocate memory).
 *
 * A Class has three types of members
 * 
 * 1. Attributes
 * 2. Constructors
 * 3. Methods
 */

public class Employee {

	/*
	 * Attributes / Properties / Fields / Instance Variables
	 */
	private int id;
	private String name;
	private double salary;
	private String position;
	
	/*
	 * A Constructor is a special method that is called automatically when we 
	 * create an object of a class. We use constructors to initialize objects.
	 *
	 * 
	 * Type of Constructors:
	 * 
	 * 1. default constructor - created by default when there are no constructors
	 * in the class.
	 * 	            Employee(){
	 *	
	 *              }
	 * 2. no-arg constructor - the declaration looks like the default constructor
	 *                         but in this case you create it.
	 *                         
	 * 3.parameterized constructor - it takes parameters that we use to initialize
	 *                               the object.
	 *                         
	 * Note - The name of the constructor is always the name of the class, never
	 *        returns a type.
	 */

	Employee(){};
	
		
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Employee(int id, String name, double salary, String position) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}
		
	/*
	 * Getters / Setters
	 * Accessors / Mutators
	 */
	
	int getId() {
		return id;
	}

	void setId(int id) {
				
		this.id = id;					
	}
	

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
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

	/*
	 * A method is a block of code that runs when it is called. 
	 * A method is always associated with class. 
	 */
	void display(){

		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
	}
	
	/*
	 * This method takes one parameter and return a value (type double)
	 * 
	 * When a method declares that it returns a value, we must use the return
	 * keyword at the end of the method's body.
	 */
	double calculateBonus(double percentage){
				
		var bonus = salary * (percentage/100);
		
		System.out.println(bonus);
		
		return bonus;
	}

}
