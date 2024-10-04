package com.bptn.course._14_access_modifiers._03_protected._01_same_package;


/*
 * The protected access modifier is the same as the 
 * default access modifier plus
 * we have access to members in other packages though inheritance.
 * 
 * The protected access modifier applies ONLY to attributes and methods.
 */


public class MyClass {
	
	protected int num = 4;
	
	protected void doSomething() {
		System.out.println("Doing Something");
	}

}
