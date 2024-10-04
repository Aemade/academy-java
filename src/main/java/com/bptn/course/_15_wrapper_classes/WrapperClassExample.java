package com.bptn.course._15_wrapper_classes;

import java.util.ArrayList;

/* In Java, Wrapper classes like Integer for int, Double for double, etc., provide
 * a way to treat primitive data types as objects. Certain situations require working
 * with objects directly instead of primitives.
 * 
 * We can use the utility functions of the wrapper class
 * 
 * The Java Collections Framework (e.g., List, Map, Set) and Generics do not support primitive types, 
 * and they require objects. Wrapper classes make it possible to store primitives in these collections.
 * 
 * Wrapper classes can be null, whereas primitive types always need to have a valid value (like 0 for int).
 */


class WrapperClassApplication {
	
	void printNumbers() {
	
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		
		System.out.println(numbers);
	
	}
	
	
}

public class WrapperClassExample {

	public static void main(String[] args) {
		
		/*
		 * We have 8 primitive types in java
		 */
		
		int num1 = 7;
		byte num2 = 8;
		short num3 = 10;
		long num4 = 347L;
		
		float num5 = 4.7F;
		double num6 = 8.3;
		
		char chr1 = 'A';
		boolean bool1 = true;
		
		
		
		/*
		 * Each primitive type has a respective reference type (Wrapper Class)
		 */
		
//		Integer num11 = Integer.valueOf(4);
		Integer num11 = 4;
		
//		System.out.println(num11);
		Byte num21 = 8;
		Short num31 = 10;
		Long num41 = 347L;
		
		Float num51 = 4.7F;
		Double num61 = 8.3;
		
		Character chr11 = 'A';
		Boolean bool11 = true;
		
		// id: 1,2,3,4,5,6,null,7,8
		
		num11 = num1; // passing data from a primitive to a wrapper class type - AutoBoxing
		
		num1 = num11; // Passing data from a wrapper class type into a primitive type - UnBoxing 	
		
		
		
		num11 = null;
		
		if (num11 == null) {
			
		}
		
//		System.out.println(num11);
//		System.out.println(num1);
		
		WrapperClassApplication wa = new WrapperClassApplication();
		wa.printNumbers();
		
		String s = "123";
		Integer number = Integer.valueOf(s);
		System.out.println(number);

	}

}
