package com.bptn.course._04_arrays_presentation_team3;

public class ArrayTraditional {

	public static void main(String[] args) {
        // Array holding daily commute times in hours (for a week)
		//Declare our Array
        double[] commuteTimes = { 1.5, 1.2, 1.8, 2.0, 1.7 }; // Commute time in hours
        double totalCommuteTime = 0; // To calculate total commute time

        System.out.println("Commute times using traditional for loop:");

        // for loop to print commute times and calculate total commute time
        // Initialization Array and indexing our elements
        for (int i = 0; i < commuteTimes.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + commuteTimes[i] + " hours");
            totalCommuteTime += commuteTimes[i];
        }

        // Calculate average commute time
        double averageCommuteTime = (double) totalCommuteTime / commuteTimes.length;
        System.out.println("Average commute time for the week: " + averageCommuteTime + " hours");

        	        
    }
}


