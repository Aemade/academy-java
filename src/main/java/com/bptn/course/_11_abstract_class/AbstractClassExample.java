package com.bptn.course._11_abstract_class;

/*
 * An abstract class is a class that can only be extended.
 * 
 * An abstract class can have abstract and non-abstract methods.
 * 
 * The class that extends the abstract class must implement the
 * abstract methods of the abstract class.
 */

abstract class MyAbstractClass{
	
	abstract void print();   

	void printHello() {
		System.out.println("Hello");
	}
}

class MyChild extends MyAbstractClass{

	@Override
	void print() {
        System.out.println("I am the Child Class");		
	}
	
	void doSomething() {
		System.out.println();
		
	}
	
}

public class AbstractClassExample {

	public static void main(String[] args) {
		
		MyChild obj = new MyChild();
		obj.print();
		obj.printHello();
	}
}
