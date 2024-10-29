package com.bptn.course._27_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_StringUppercaseExample {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple","banana","cherry","date","elderberry");

		/*
		 * Statement: Convert all the elements on the list to Uppercase
		 */
		
		/* Object Oriented Programming */
		
		List<String> uppers = new ArrayList<>();		
		
		for (String fruit : fruits) {
			uppers.add(fruit.toUpperCase());
		}
		
		System.out.println("OOP: " + uppers);
		
		/* Functional Programming */
		
		uppers = fruits.stream()
				          .map(String::toUpperCase)
				          .toList();
		
		System.out.println("FP: " + uppers);

	}

}
