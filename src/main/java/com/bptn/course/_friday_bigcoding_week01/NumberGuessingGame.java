package com.bptn.course._friday_bigcoding_week01;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Initialize target number to 23 as per the problem statement
        int targetNumber = 23;
        Scanner scanner = new Scanner(System.in);  // Create a scanner object for user input
        int guess;  // Variable to store the user's guess

        // Loop until the user guesses the correct number
        while (true) {
            // Prompt the user to enter a guess
            System.out.print("Please enter a number between 1 and 100 ");
            guess = scanner.nextInt();

            // Validate the guess to ensure it's between 1 and 100
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid input! Please guess a number between 1 and 100.");
                continue;  // Go back to the start of the loop to prompt again
            }

            // Check if the guess is too low
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            }
            // Check if the guess is too high
            else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
            // If the guess is correct
            else {
                System.out.println("Congratulations! You guessed the number correctly!");
                break;  // Exit the loop
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}