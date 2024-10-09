package com.bptn.course._17_solid._02_ocp;


interface Document{
	
	void print();
}

class Invoice implements Document{

	@Override
	public void print() {
		System.out.println("Print Invoice");
	}
	
}

class Contract implements Document{

	@Override
	public void print() {
		System.out.println("Print Contract");
	}
	
}

class CreditNote implements Document{

	@Override
	public void print() {
		System.out.println("Print Credit Note");
	}	
}

class Hello implements Document{
	
	@Override
	public void print() {
		System.out.println("Print Credit Note");
	}	
}


// Open to extension and closed to modifications
class Printer{
	
	void print(Document doc){
		doc.print();
	}
}


public class OpenClosed {

	public static void main(String[] args) {

		Printer prt = new Printer();
		
		Invoice inv = new Invoice();
		Contract con = new Contract();
		CreditNote cre = new CreditNote();
		Hello heo = new Hello();
		
		prt.print(inv);
		prt.print(con);
		prt.print(cre);
		prt.print(heo);
	}

}
