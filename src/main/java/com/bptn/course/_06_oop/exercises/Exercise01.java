package com.bptn.course._06_oop.exercises;


class MyClass{

	/*
	 * Attributes / Properties / Fields / Instance Variables
	 */
	int a;
	String str;
	

	/*
	 * Constructors
	 */
	MyClass(int a, String str) {
		this.a = a;
		this.str = str;
	}

	/*
	 * Methods
	 */
	int getA() {
		return a;
	}

	void setA(int a) {
		this.a = a;
	}

	String getStr() {
		return str;
	}

	void setStr(String str) {
		this.str = str;
	}

	void print() {
		System.out.println(a);
		System.out.println(str);
	}
	
	String doSomething() {
		return a + " " + str;
	}

	String doSomething(String prefix) {
		return prefix + " " + a + " " + str;
	}
	
}




public class Exercise01 {

	public static void main(String[] args) {

		// DRY - Don't repeat yourself.
		
		MyClass obj = new MyClass(1,"Hello");
		obj.setA(0);
		
		obj.print();
		
        process(obj,"Java");
		

		MyClass obj2 = new MyClass(2,"Hello2");
		obj2.setA(2);
		
		obj2.print();
		
		process(obj2,"Java2");
			
	}
	
	
	static void process(MyClass obj, String st) {
			
		String str = obj.doSomething();
		System.out.println(str);
		
		String str2 = obj.doSomething(st);
		System.out.println(str2);
	}

	
	
	
	
	
	
	
	
	
	
}
