package com.bptn.course._17_solid._01_srp;

import java.util.Date;

class Invoice{
	
	int id;
	Date date;
	double amount;
	/*
	 
	 This is NOT single responsibility
	 Why? Invoice is handling the Invoice Logic and Print the invoice
	 
	void print(){
		// Add logic to print the invoice.
	}*/
}

class Printer{
	
	void print(Invoice inv){
		// Add logic to print the invoice.	
	}
}




public class SingleResponsibilty {

	public static void main(String[] args) {

		Printer prt = new Printer();
		
		Invoice inv = new Invoice();
		
		// Print the invoice
		prt.print(inv);
		
		
	}

}
