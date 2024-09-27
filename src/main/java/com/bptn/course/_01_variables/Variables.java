package com.bptn.course._01_variables;

public class Variables {

	public static void main(String[] args) {

		//Declare two integer variables and assign them values.
	    int num1 = 12;
        int num2 = 8;
        
        /*Perform arithmetic operations (addition, subtraction, multiplication, and division) using these variables and store the results in new variables.*/
        
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = (double)num1 / num2;
        
        // Print the original variables and the results of the arithmetic operations.
        System.out.println("Original values: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("addition: " + addition);
        System.out.println("subtractione: " + subtraction);
        System.out.println("multiplication: " + multiplication);
        System.out.println("division: " + division);
        
        // Reassign new values to the original variables
        num1 = 24;
        num2 = 16;
        
        // Print the new values
        System.out.println("New values: num1 = " + num1 + ", num2 = " + num2);
        
        // Declare a character and a string variable
        char letter = 'A';
        String text = "Hello to cohert 6 !";
        
        // Print the character and string variables
        System.out.println("Character: " + letter);
        System.out.println("String: " + text);
    }


	}


