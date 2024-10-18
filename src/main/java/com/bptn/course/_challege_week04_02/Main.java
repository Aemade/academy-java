package com.bptn.course._challege_week04_02;

import java.util.Arrays;

class Main {

    public static void main(String args[]) {
        // Test array
        int[] arr = {181, 289, 390, 121, 145, 736, 514, 212};
        
        System.out.print("Printing original array: ");
        System.out.println(Arrays.toString(arr));

        // Sort array using merge sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Printing sorted array: ");
        System.out.println(Arrays.toString(arr));

        // Test cases
        testMergeSort();
    }

    // Merges two subarrays of arr[]
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int r) {
        // Find the sizes of the two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = arr[m + 1 + j];

        // Merge the two subarrays

        // Initial indexes of the subarrays
        int i = 0, j = 0;

        // Initial index of the merged subarray
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left[] if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right[] if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using merge()
    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Recursively sort the two halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // Test the Merge Sort algorithm with various test cases
    static void testMergeSort() {
        int[][] testCases = {
            {12, 11, 13, 5, 6, 7},
            {},
            {0},
            {0, -1},
            {22, 22, 33, 1, 33, 4, 5}
        };

        for (int[] testCase : testCases) {
            System.out.print("Original: " + Arrays.toString(testCase));
            mergeSort(testCase, 0, testCase.length - 1);
            System.out.println(" => Sorted: " + Arrays.toString(testCase));
        }
    }
}
