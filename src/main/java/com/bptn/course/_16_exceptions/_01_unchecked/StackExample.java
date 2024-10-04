package com.bptn.course._16_exceptions._01_unchecked;


class MyClass{
		
	void hello() {
       System.out.println("hello");
       this.hello1();
	}
	
	void hello1() {
	   System.out.println("hello1");
	   this.hello2();
	}

	void hello2() {
		System.out.println("hello2");
		this.hello3();
	}
	void hello3() {
		System.out.println("hello3");
		this.hello4();
	}
	void hello4() {
		System.out.println("hello4");
		throw new RuntimeException();
	}		
	
}

public class StackExample {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.hello();
	}
}
