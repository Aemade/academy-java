package com.bptn.course._04_arrays_presentation_team3;

public class ArraysEnhanced {

	public static void main(String[] args) {
					 // Array holding daily commute times in hours (for a week)
	        double[] commuteTimes = { 1.5, 1.2, 1.8, 2.0, 1.7 }; // Commute time in hours
	        double totalCommuteTime = 0; // To calculate total commute time
	        // Enhanced for loop (for-each) to print commute times and calculate total commute time
	        int day =1;
	        for (double commute : commuteTimes) {
	            System.out.println("Day " + day + ": " + commute + " hours");
	            totalCommuteTime += commute;
	            day++;
	        }
	        // Calculate average commute time again
	        double averageCommuteTime = (double) totalCommuteTime / commuteTimes.length;
	        System.out.println("Average commute time for the week: " + averageCommuteTime + " hours");

		}

	}
