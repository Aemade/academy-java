package com.bptn.course._22_sorting;

import java.util.Arrays;

public class InsertionSort {
	
	
	
	public static void insertionSort(int[] elements) {
		
		/*
		 * We divide the original array in two parts:
		 *  unsorted: to the right
		 *  sorted: to the left
		 * 
		 * We need to move the elements one by one from the unsorted part
		 * to the sorted part. We need to insert the element
		 * into the right place in the sorted part.
		 * 
		 * We start from index=1 because we assume the
		 * first element in the array is already sorted.
		 * 
		 * We repeat the following logic using for-loop for 
		 * each element in the unsorted part of the array. 
		 * 
		 *  The Time-Complexity of Insertion Sort is quadratic -> O(n^2).
		 * 
		 */
		
		for (int i = 1; i < elements.length; i++) {
			
			
			/*
			 * We store the current element (in the iteration) in a temporary variable (temp)
			 * so we can insert it when we find the right insertion point.
			 * 
			 * We store the value of the current index as well
			 */
			
			int temp = elements[i];
			int possibleIndex = i;
			
			
			/*
			 * Since we don't know the insertion position we use a while-loop
			 * 
			 * Conditions for the while-loop
			 * 
			 * 1. possibleIndex>0: We have to ensure that the new index is greater than zero
			 *                        otherwise we could get an ArrayIndexOutOfBoundsException.
			 *                        
			 * 2. temp < elements[possibleIndex - 1]: We check if the current element is smaller than the previous element. 
			 *                                                
			 * If both conditions evaluate to true then we move the previous element one position to the right (inside the while-loop) and
			 * we decrease the possibleIndex by one unit.
			 */
			
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
				
				/*
				 * We move the element one position to the right if it is smaller than the current element
				 */
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--; // 
	
			}
			
			/*
			 * Once we found the insertion point, we insert the current element.
			 */
			
			elements[possibleIndex] = temp;
				
			
			
		}
		
		
	}
	
	

	public static void main(String[] args) {
		
		int[] arr1 = {3,15,8,2,19,55};
		
		System.out.println("Before: " + Arrays.toString(arr1));
		
		insertionSort(arr1);
		
		System.out.println("After: " + Arrays.toString(arr1)); // [2,3,8,15,19,55]
		
		
		
		

	}

}
