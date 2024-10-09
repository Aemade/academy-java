package com.bptn.course._18_collections.exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise01 {

	public static void main(String[] args) {

		/* 
		 * Write a Java program that, given a List of Strings, 
		 * prints out the unique elements only.
		 */
		
		List<String> strs = List.of("John", "Jane","John", "Mike");
		
		Set<String> set = new HashSet<>(strs);
		
		System.out.println(set);
	}

}
