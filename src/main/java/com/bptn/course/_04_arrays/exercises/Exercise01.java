package com.bptn.course._04_arrays.exercises;

public class Exercise01 {

	// Write a Java program to calculate the average value of array elements.
	
	public static void main(String[] args) {
		
		int[] nums = { 1, 4, 6, 7, 8, 9, 3 , 13, 26};

		int sum = 0;
		
		for (int num : nums) {
			
			sum = sum + num;
		}
		
		double avg = (double)sum / nums.length;
		
		System.out.println("The avg is: " + avg);
		System.out.printf(" %.2f The avg is: , # of elements: %d %n", avg, nums.length);
		System.out.println("The avg is: " + avg);
	}

}
