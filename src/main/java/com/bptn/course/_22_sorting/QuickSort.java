package com.bptn.course._22_sorting;

import java.util.Arrays;
import java.util.Stack;

public class QuickSort {
	
	/*
	 * Time Complexity is O (n log n)
	 */
	
	private static int partition(int[] numbers, int start, int end) {
		// pick the rightmost element as a pivot from the array
		int pivot = numbers[end];  // an element at the end of the array
		
		
		// elements less than the pivot will go to the left of the 'pIndex'
		// elements greater than the pivot will go to the right of the 'pIndex'
		// equal elements can go either way
		int pIndex = start;
		
		for (int i = start; i<end; i++) {
			if (numbers[i] <= pivot) {
				swap(numbers, i, pIndex);
				pIndex++;
			}
		}
		
		// swap 'pIndex with pivot
		swap(numbers, pIndex, end);
		
		// return 'pIndex' (index of the pivot element)
		return pIndex;
	
	}
	
	private static void swap(int[] numbers, int i, int j) {
		
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		
		
	}

	// Iterative Quicksort routine
	private static void iterativeQuicksort(int[] numbers) {
		
		Stack<Pair> stack = new Stack<>();
		
		// get the starting and ending index of the given array
		int start = 0;
		int end = numbers.length - 1;
		
		
		// push the start and end index of the array into the stack
		stack.push(new Pair(start, end));
		
		// loop until the stack is empty
		while (!stack.empty()) {
			
			// remove top pair from the stack and get subarray starting
			// and ending index
			
			start = stack.peek().getX();
			end = stack.peek().getY();
			stack.pop();
			
			// rearrange the elements across pivot
			int pivot = partition(numbers, start, end);
			
			// push subarray indices containing elements that are
			// less than the current pivot to the stack
			if (pivot - 1 > start) {
				stack.push(new Pair(start, pivot - 1));
			}
			
			// push subarray indices containing elements that are 
			// more than the current pivot to stack
			if (pivot + 1 < end) {
				stack.push(new Pair(pivot + 1, end));
			}
			
				
			
		}
	
		
	}
	

	public static void main(String[] args) {
		
		
		int numbers[] = { 9, -3, 5, 2, 6, 8, -6, 1};
		
		System.out.println("Before: " + Arrays.toString(numbers));
		
		iterativeQuicksort(numbers);
		
		System.out.println("After: " + Arrays.toString(numbers));

	}
	

}

// Simple Pair class in Java
class Pair {
	
	private final int x;
	private final int y;
	
	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}
	
	
	
}












