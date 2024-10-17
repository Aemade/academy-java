package com.bptn.course._21_search;

public class BinarySearch {

    public static int binarySearch(int[] input, int key) {
    	
        int start = 0;
        int end = input.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == input[mid]) {
                return mid;
            }
            if (key < input[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
    
	public static void main(String[] args) {

        int[] input = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 14;
        
        System.out.println(BinarySearch.binarySearch(input, key));

	}

}

