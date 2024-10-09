package com.bptn.course._18_collections.exercises;

import java.util.HashSet;
import java.util.Set;

class MyClass {

	Set<String> set1;
	Set<String> set2;
	
	
	MyClass(Set<String> set1, Set<String> set2) {
		super();
		this.set1 = set1;
		this.set2 = set2;
	}


	Set<String> getSet1() {
		return set1;
	}


	Set<String> getSet2() {
		return set2;
	}
	
	
	
	
}
public class Exercise03 {

	public static void main(String[] args) {

		/*
		 * Write a Java program that compares two Sets of Strings and 
		 * creates a third Set with the common strings.
		 */
		
		Set<String> set1 = Set.of("John", "Jane", "Hello", "Mike");
		Set<String> set2 = Set.of("Jane","John", "Mike");

		Set<String> set3 = getCommon(set1,set2);
		Set<String> set4 = getCommon(new MyClass(set1,set2));
		
		System.out.println(set3);
		System.out.println(set4);
		
	}
	
	static Set<String> getCommon(Set<String> set1, Set<String> set2) {
		
		Set<String> set3 = new HashSet<>();
		
		for (String str: set1) {
			
			if (set2.contains(str)) {
				
				set3.add(str);
			}
			else {
				System.out.println(str + " is not present in set2");
			}
		}
		
		return set3;
	}

	static Set<String> getCommon(MyClass myClass) {
		
		return getCommon(myClass.getSet1(), myClass.getSet2());
	}

}
