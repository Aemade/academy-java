package com.bptn.course._20_junit;

public class Calculator {

	int findMax(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
}
