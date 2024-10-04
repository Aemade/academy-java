package com.bptn.course._friday_bigcoding_week01;

import java.util.Scanner;

	public class WordEncryption {

	
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word to encrypt: ");
        String word = scanner.nextLine();

        // Call the encryptWord method to get the encrypted version of the input word
        String encryptedWord = encryptWord(word);

        // Display the encrypted word as output
        System.out.println("Encrypted word: " + encryptedWord);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to encrypt the word by shifting each character by 1 position in the alphabet
    public static String encryptWord(String word) {
        // StringBuilder to construct the encrypted word
        StringBuilder encrypted = new StringBuilder();

        // Iterate over each character in the input word
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);  // Get the character at the current index

            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                // Shift the letter by one position in the alphabet, wrap around from 'z' to 'a'
                char encryptedChar = (char) ((c - 'a' + 1) % 26 + 'a');
                encrypted.append(encryptedChar);  // Append the encrypted character to the result
            }
            // Check if the character is an uppercase letter
            else if (c >= 'A' && c <= 'Z') {
                // Shift the letter by one position in the alphabet, wrap around from 'Z' to 'A'
                char encryptedChar = (char) ((c - 'A' + 1) % 26 + 'A');
                encrypted.append(encryptedChar);  // Append the encrypted character to the result
            }
            // If the character is not a letter, leave it unchanged
            else {
                encrypted.append(c);  // Append the non-alphabetic character as is
            }
        }

        // Return the encrypted word as a string
        return encrypted.toString();
    }
}