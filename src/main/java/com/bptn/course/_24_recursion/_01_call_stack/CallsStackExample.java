package com.bptn.course._24_recursion._01_call_stack;

public class CallsStackExample {

	static void test1() {
		System.out.println("In Test 1");
		test2();
	}

	static void test2() {
		System.out.println("In Test 2");
		test3();
	}
	
	static void test3() {
		System.out.println("In Test 3");
		test4();
	}

	static void test4() {
		System.out.println("In Test 4");
		test5(); // Test5() is removed from the Call Stack because it finished its execution.
	}
	static void test5() {
		System.out.println("In Test 5");
		
		throw new RuntimeException("End of the calls");
		/*
		 * Throwing an Exception will make Java print out the Call Stack
		 */
	}
			
	public static void main(String[] args) {

		System.out.println("In Main");
		
		test1();
	}

}
