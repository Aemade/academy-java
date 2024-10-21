package com.bptn.course._bigcoding_week05_01;

public class InsertionSort {
	    // This method sorts an array in ascending order using insertion sort algorithm
	    public static void insertionSort(int[] arr) {
	    	
	    	// Check if the array is null or has less than 1 element
	        if (arr == null || arr.length <= 1) {
	            // Return if the array is null or has less than 1 element
	        return;
	        }
	        // Loop through the array starting from index 1 to length of the array
	        for (int i = 1; i < arr.length; i++) {
	            // Store the current element
	        int current = arr[i];    
	            // Initialize j with i - 1
	        int j = i - 1;   
	            // Inner loop to compare current element with elements before it in the array
	            while (j >= 0 && arr[j] > current) {
	                // Shift the element to the right
	            arr[j + 1] = arr[j];    
	                // Decrement j to compare with next element
	            j--;   
	            }
	            // Insert the current element at its correct position
	        arr[j + 1] = current;    
	        }
	    }
	  //Do not modify below code
	    public static void main(String[] args) {
	        // Initialize the array
	        int[] arr = {3, 4, 1, -2, 4, 8};
	        // Call the sort method to sort the array
	        insertionSort(arr);
	        // Print the sorted array
	        System.out.print("Sorted array: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}
/*code explanation: As the coding assignment is inserting and sorting an array, our method first checks 
if the array is null or containes any element. 
If the array length is less than or equals to one our return will be performed without sorting.

As the insertion sort assumes that the first element is already sorted, 
so it starts comparing from the second element and goes through the end of the array.
(the outher loop performs this task)

The inner loop compares the current element with the elements before it, arr[j] > current means 
the element at index j is greater than the current element, so it needs to be shifted right to make space.

After shifting, it inserts the current element into its correct position, and finally, 

The Main Method demonstrates sorting an example array and printing the sorted result.
*/