package com.bptn.course._27_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _02_EvenNumbersExample {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,8);

		/*
		 * Statement
		 * Get the even numbers from the list
		 */

		/* Using Object Oriented Programming */
		
		List<Integer> evens = new ArrayList<>();
		
		for(int num: nums) {
			
			if ( num%2==0 ) {
				evens.add(num);
			}
		}

		System.out.println("OOP: " + evens);
		
		/* Functional Programming - Streams */
		
		Set<Integer> set = nums.stream()
				                  .filter(num -> num%2 == 0)
				                  .collect(Collectors.toSet());

		System.out.println("FP: " + set);
	}

}
