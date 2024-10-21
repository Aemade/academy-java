/*Code explanation:  
Binary search requires a sorted array list

We set the low and high pointers to start and end the arry.

The while (low <= high) {
    int mid = (low + high) / 2; loop will continue its task as long as the low value is less than high 

we calculate the midel index by dividing the sum of high and low by 2 and return 0 if index =key
element at mid<key mid + 1, if greater mid-1

loop exist if no key found with -1 value.

By calling binarySearch() the main initializes an unsorted array and a key to be searched.

*/
package com.bptn.course._bigcoding_week05_02;

import java.util.Arrays;

public class BinarySearch {

	// Binary search method that takes an unsorted array and a key element to search for
	public static int binarySearch(int[] arr, int key) {
		// Sort the array before applying binary search
		Arrays.sort(arr);
		
		// Initialize low and high pointers for the start and end of the array respectively
				int low = 0;
        int high = arr.length - 1;

		// Keep looping until the high pointer is greater than or equal to the low pointer
		while (low <= high) {
			// Calculate the middle index
		int mid = (low + high) / 2;	
			// If the element at the middle index is equal to the key, return the index
			if (arr[mid] == key) {
                return mid;
				
			}
			// If the element at the middle index is less than the key, move the low pointer to the middle + 1
			else if (arr[mid] < key) {
                low = mid + 1;
				
			}
			// If the element at the middle index is greater than the key, move the high pointer to the middle - 1
			else {
                high = mid - 1;
				
			}
		}
		// If the key is not found, return -1
		return -1;
	}

    //Do not modify the code below
	public static void main(String[] args) {

		// Create an Array of integers
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Key to be searched for:
		int key = 22;

		// Perform binary search on the Array
		int result = binarySearch(arr, key);

		// Print the result
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}
