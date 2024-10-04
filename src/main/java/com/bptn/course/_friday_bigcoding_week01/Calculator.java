package com.bptn.course._friday_bigcoding_week01;

import java.util.Scanner;
public class Calculator {

public static void main(String[] args) {
	
			Scanner scanner = new Scanner(System.in);
	        int choice;
	        do {
	            // Display the menu
	            System.out.println("/…Calculator Menu…/");
	            System.out.println("Press 1 for addition");
	            System.out.println("Press 2 for subtraction");
	            System.out.println("Press 3 for multiplication");
	            System.out.println("Press 4 for division");
	            System.out.println("Press 5 to square a number");
	            System.out.println("Press 6 to find a square root");
	            System.out.println("Press 7 to find the reciprocal");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            // Process the user's choice
	            if (choice == 1) {
	                System.out.print("Enter the first number: ");
	                double num1 = scanner.nextDouble();
	                System.out.print("Enter the second number: ");
	                double num2 = scanner.nextDouble();
	                System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + (num1 + num2));
	            } else if (choice == 2) {
	                System.out.print("Enter the first number: ");
	                double num1 = scanner.nextDouble();
	                System.out.print("Enter the second number: ");
	                double num2 = scanner.nextDouble();
	                System.out.println("The difference between the numbers " + num1 + " and " + num2 + " is = " + (num1 - num2));
	            } else if (choice == 3) {
	                System.out.print("Enter the first number: ");
	                double num1 = scanner.nextDouble();
	                System.out.print("Enter the second number: ");
	                double num2 = scanner.nextDouble();
	                System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + (num1 * num2));
	            } else if (choice == 4) {
	                System.out.print("Enter the first number: ");
	                double num1 = scanner.nextDouble();
	                System.out.print("Enter the second number: ");
	                double num2 = scanner.nextDouble();
	                if (num2 != 0) {
	                    System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + (num1 / num2));
	                    System.out.println("The remainder is " + (num1 % num2));
	                } else {
	                    System.out.println("Cannot divide by zero.");
	                }
	            } else if (choice == 5) {
	                System.out.print("Enter the number to square: ");
	                double num = scanner.nextDouble();
	                System.out.println("The Square of the number " + num + " is = " + (num * num));
	            } else if (choice == 6) {
	                System.out.print("Enter the number to find the square root: ");
	                double num = scanner.nextDouble();
	                System.out.println("The Square root of the number " + num + " is = " + Math.sqrt(num));
	            } else if (choice == 7) {
	                System.out.print("Enter the number to find the reciprocal: ");
	                double num = scanner.nextDouble();
	                if (num != 0) {
	                    System.out.println("The Reciprocal of the number " + num + " is = " + (1 / num));
	                } else {
	                    System.out.println("Cannot find the reciprocal of zero.");
	                }
	            } else {
	                System.out.println("Invalid choice! Please make a valid choice.");
	            }

	            // Ask if the user wants to continue
	            System.out.print("To continue calculation press 1, else press any other number to exit: ");
	            choice = scanner.nextInt();
	        } while (choice == 1);

	        scanner.close(); // Close the scanner
	    }
	}

