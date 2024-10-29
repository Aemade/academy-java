package com.bptn.course._26_method_reference;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Sayable {
	
	void say();
}

class MyClass {
	
	static void saySomething() {
		System.out.println("I say something");
	}
	
	void saySomething2() {
		System.out.println("I say something 2");
	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {

		/*
		 * If the code for the interface's abstract method doesn't exist
		 * we can implement it with a Lambda expression.
		 */
		
		Sayable obj = () -> System.out.println("I love Java");
		obj.say();		
		
		/*
		 * STATIC method
		 * 
		 * If the code already exists, we can assign a method reference to 
		 * reuse that code.
		 */
		Sayable obj2 = MyClass::saySomething;
		obj2.say();
		
		/*
		 * NON-STATIC method
		 * 
		 * When the method to refer is not static, we need to create an object to
		 * refer to the method. 
		 */		
		
		MyClass myClass = new MyClass();
		
		Sayable obj3 = myClass::saySomething2;
		obj3.say();
		
		/* We can use an anonymous object */
		Sayable obj4 = new MyClass()::saySomething2;
		obj4.say();
		
		
		List<String> strs = new ArrayList<>(List.of("Hello","Java"));
		
		/*
		 * The forEach() method accepts a Consumer Functional interface and the
		 * abstract method is;
		 *  
		 *   void accept(T t)
		 *   1. takes one parameter
		 *   2. return void (nothing)
		 *   
		 *   public void println(String x)
		 */
		//strs.forEach(str -> System.out.println(str));
		strs.forEach(System.out::println);
	}

}
