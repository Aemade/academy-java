package com.bptn.course._07_overloading;

import java.util.Date;

/*
 * Overloading is a type of Polymorphism - Poly: Many, Morphism: Forms
 * 
 * Overloading is a situation where in the same class, two or more methods/constructors
 * have the same name but different parameters types.
 * 
 * Overloading only happens with methods and constructors
 */

class Invoice{
	
}

class CreditNote{
	
}

class Receipt{
	
}

class Printer{
	
	
	void print(Invoice inv, int num) {
		
	}
	
	void print(CreditNote crn) {
		
	}
	
	void print(Receipt rec, Date date) {
		
	}

	void printInvoice(Invoice inv) {
		
	}
	
	void printCreditNote(CreditNote crn) {
		
	}
	void printReceipt(Receipt rec) {
		
	}
}




class MyClass {
	
	int num;
	String str;
	
	/*
	 * Constructor Overloading
	 */
	
	MyClass(){
		
	}

	MyClass(int num){
		this.num = num;
	}

	MyClass(String str){
		this.str = str;
	}

	MyClass(int num, String str){
		this.num = num;
		this.str = str;
	}

	MyClass(String str,int num){
		this.num = num;
		this.str = str;
	}

	MyClass(String str,int num, int hello){
		this.num = num * hello;
		this.str = str;
	}
	
	/*
	 * Method Overloading
	 */
	
	String concatenate(){
		
		return "Hello " + this.str;
	}

	String concatenate(String str){
		
		return "Hello " + this.str + str;
	}

	String concatenate(String str, int num){
		
		return "Hello " + str + " " + num;
	}
	
	String concatenate(int num, String str){
		
		return "Hello " + str + " " + num;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

public class OverloadingExample {

	public static void main(String[] args) {

		MyClass obj = new MyClass(4,"Hello");
	}

}
