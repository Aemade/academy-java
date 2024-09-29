package com.bptn.course._bigcoding_week01;

		import java.util.Scanner;

		class StringOperation {
		    public static void main(String[] args) {
		    	

		Scanner scanner = new Scanner(System.in);
	        int choice;
	        do {
	            System.out.println("\n/…String Menu…/");
	            System.out.println("Press 1 for Palindrome Check");
	            System.out.println("Press 2 to Reverse a String");
	            System.out.println("Press 3 to Concatenate two Strings");
	            System.out.println("Press 4 for String Comparison");
	            System.out.println("Press 5 to Calculate the Length of a String");
	            System.out.println("Press 6 to Exit");
	            System.out.print("Enter your option: ");
	            choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

	            switch (choice) {
	                case 1:
	                    // Palindrome Check
	                    System.out.print("Enter a string: ");
	                    String str1 = scanner.nextLine();
	                    if (isPalindrome(str1)) {
	                        System.out.println(str1 + " is a palindrome");
	                    } else {
	                        System.out.println(str1 + " is not a palindrome");
	                    }
	                    break;

	                case 2:
	                    // Reverse a String
	                    System.out.print("Enter a string to reverse: ");
	                    String str2 = scanner.nextLine();
	                    System.out.println("Reversed string: " + reverseString(str2));
	                    break;

	                case 3:
	                    // Concatenate two Strings
	                    System.out.print("Enter First string: ");
	                    String firstString = scanner.nextLine();
	                    System.out.print("Enter Second string: ");
	                    String secondString = scanner.nextLine();
	                    System.out.println("Concatenated string: " + firstString + secondString);
	                    break;

	                case 4:
	                    // String Comparison
	                    System.out.print("Enter First string: ");
	                    String string1 = scanner.nextLine();
	                    System.out.print("Enter Second string: ");
	                    String string2 = scanner.nextLine();
	                    if (string1.equals(string2)) {
	                        System.out.println("The entered strings are equal");
	                    } else {
	                        System.out.println("The entered strings are not equal");
	                    }
	                    break;

	                case 5:
	                    // Calculate the Length of a String
	                    System.out.print("Enter a string: ");
	                    String strLength = scanner.nextLine();
	                    System.out.println("The length of the entered string is: " + strLength.length());
	                    break;

	                case 6:
	                    // Exit the program
	                    System.out.println("Exiting the program.");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Please make a valid choice.");
	            }
	        } while (choice != 6);

	        scanner.close();
	    }

	    // Method to check if a string is a palindrome
	    public static boolean isPalindrome(String str) {
	        int start = 0;
	        int end = str.length() - 1;
	        while (start < end) {
	            if (str.charAt(start) != str.charAt(end)) {
	                return false;
	            }
	            start++;
	            end--;
	        }
	        return true;
	    }

	    // Method to reverse a string
	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder(str);
	        return reversed.reverse().toString();
	    }
	}