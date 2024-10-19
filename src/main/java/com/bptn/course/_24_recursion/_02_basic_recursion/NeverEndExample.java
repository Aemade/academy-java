package com.bptn.course._24_recursion._02_basic_recursion;


/*
 * Call Stack
 *
 * -> neverEnd(11549) --> java.lang.StackOverflowError 
 * --------- 
 * -> ....
 * --------- 
 * -> ....
 * --------- 
 * -> neverEnd(3)
 * --------- 
 * -> neverEnd(2)
 * ---------
 * -> neverEnd(1)
 * --------- 
 * -> neverEnd(0)
 * ---------
 * -> main
 */

public class NeverEndExample {

	public static void main(String[] args) {

		neverEnd(0);
	}

	static void neverEnd(long num) {
		System.out.println("This is the method that never ends, num= " + num);
		
		if ( num == 5000 ) {
			System.out.println("Bye!!!");
		}
		else {			
			neverEnd(num+1);
		}
		
	}
}
