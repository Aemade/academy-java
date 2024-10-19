package com.bptn.course._challege_week04_03.IL411;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {

    public static void main(String[] args) {
        // Create a list of strings
    List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");     

        // Count the number of elements in the list
        // Use the stream() method to convert the list to a stream of strings
        // Use the count() terminal operation on the stream of strings
         
    long count = words.stream().count();
        // Print the count
        System.out.println("Count numbers of words in the list " + count );

        // Iterate over the list and print each word using a lambda expression
    words.forEach(word -> System.out.println(word));
        // Using a method reference, transform words to uppercase
        // map() is an intermediate operation that transforms each word to uppercase
        // collect is a terminal operation that collects the results into a list
    List<String> upperCaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());   

        // Print the list of words in uppercase
        System.out.println("Words in upper case " + upperCaseWords);
    }
}
