package com.bptn.course._17_solid._05_dip;

interface MyInterface{
	
	void doSomething();
}

class MyClass implements MyInterface {

	@Override
	public void doSomething() {
		
		System.out.println("Doing Something");
	}
}




public class DependencyInversion {

	public static void main(String[] args) {

		MyInterface obj = new MyClass();
		obj.doSomething();
	}

}





