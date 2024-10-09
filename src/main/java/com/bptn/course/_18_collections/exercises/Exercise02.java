package com.bptn.course._18_collections.exercises;

import java.util.Set;

public class Exercise02 {

	public static void main(String[] args) {

		/*
		 * Write a Java program that compares two Sets of Strings to determine 
		 * whether they are equal.
		 */
		
		Set<String> set1 = Set.of("John", "Jane", "Mike");
		Set<String> set2 = Set.of("Jane","John", "Mike", "Hello");
		
		//boolean equals = set1.equals(set2);
		boolean equals = checkEquals(set1,set2);
		
		System.out.println(equals);
		
		equals = set1.containsAll(set2) && set2.containsAll(set1);
		System.out.println(equals);
		
		equals = set1.size() == set2.size() && set1.containsAll(set2);
		System.out.println(equals);
	}
	
	static boolean checkEquals(Set<String> set1, Set<String> set2) {
		
		if (set1.size() != set2.size()) {
			return false;
		}
		
		for (String str: set1) {
			
			if (!set2.contains(str)) {
				return false;
			}
		}
		
		return true;
	}

}
