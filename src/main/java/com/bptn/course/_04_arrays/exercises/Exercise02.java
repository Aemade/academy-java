package com.bptn.course._04_arrays.exercises;

public class Exercise02 {

	/*
	 * Search for a key in an array of integers and print out the index
	 */
	public static void main(String[] args) {

		int[] nums = { 1, 4, 7, 3, 8, 9 }; // Assume the elements are unique 
		int key = 8;
	
		int index = -1;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == key) {
				index = i;
				//break;
			}
		}
		
		System.out.println("Key found at index: " + index);
	}

}

