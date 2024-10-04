package com.bptn.course._14_access_modifiers._01_private;



/*
 * Private can be applied to: constructors, methods, and attributes.
 * A private member is visible (or accessible) from within the class ONLY. 
 */


class MyClass{
	
	private int num = 7;
	
	int getNum() {
		return num;
	}
	
	void setNum(int num) {
		
		this.num = num;
	}
	
	private void print() {
		System.out.println(this.num);
	}
}

class MyChild extends MyClass{
	
	void hello() {
//		this.num = 10;
		
		this.setNum(10);
		
//		this.print();
			
		
	}
}





public class PrivateExample {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
//		obj.print(); // can not call print, since print is a private method
		System.out.println(obj.getNum());
		

	}

}
