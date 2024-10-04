package com.bptn.course._friday_bigcoding_week01;

import java.util.Scanner;

public class PluralForm {
    public static void main(String[] args) {
        // Create a Scanner object to read user inputs
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount
        System.out.print("Enter a number: ");
        int amt = scanner.nextInt();  // Store the input number
        scanner.nextLine();  // Consume the newline character after the integer input

        // Prompt the user to enter the singular noun
        System.out.print("Enter a singular noun: ");
        String word = scanner.nextLine();  // Store the singular noun

        // Call the method to get the plural form of the word based on the number
        String pluralizedWord = getPluralForm(amt, word);

        // Output the result
        System.out.println(amt + " " + pluralizedWord);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to determine the plural form of the noun based on the amount
    public static String getPluralForm(int amt, String word) {
        // If the amount is 1, return the word in its singular form
        if (amt == 1) {
            return word;
        }

        // Handle irregular nouns (e.g., knife -> knives, hippopotamus -> hippopotami)
        if (word.equalsIgnoreCase("knife")) {
            return "knives";
        }
        if (word.equalsIgnoreCase("hippopotamus")) {
            return "hippopotami";
        }
        if (word.equalsIgnoreCase("cactus")) {
            return "cacti";
        }
        if (word.equalsIgnoreCase("child")) {
            return "children";
        }
        if (word.equalsIgnoreCase("person")) {
            return "people";
        }
        if (word.equalsIgnoreCase("mouse")) {
            return "mice";
        }

        // Handling nouns ending with 'y' but not 'ay', 'ey', 'oy', 'uy'
        if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("ey") &&
            !word.endsWith("oy") && !word.endsWith("uy")) {
            // Change 'y' to 'ies' for words like 'fly' -> 'flies'
            return word.substring(0, word.length() - 1) + "ies";
        }

        // Handling nouns ending in 's', 'x', 'z', 'ch', or 'sh' that require adding 'es'
        if (word.endsWith("s") || word.endsWith("x") || word.endsWith("z") ||
            word.endsWith("ch") || word.endsWith("sh")) {
            // Add 'es' for words like 'box' -> 'boxes' or 'bus' -> 'buses'
            return word + "es";
        }

        // Default case: simply add 's' for general plural form
        return word + "s";
    }
}