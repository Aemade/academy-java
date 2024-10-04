package com.bptn.course._10_interfaces;

class Person{
	
}

interface Hello{

	
}

interface Hello2 extends Hello{
	
}

class Employee extends Person implements Income, Hello {


	int id;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public double calculatePay(double salary, double taxes) {
		return salary - taxes;
	}

	@Override
	public void doSomething() {

		System.out.println("Do Something");
	}


	public void doSomethingByEmployee() {

		System.out.println("Do Something 2");
	}

	
}



public class InterfaceExample {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.getId();
	}

}
