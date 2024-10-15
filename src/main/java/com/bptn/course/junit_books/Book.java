package com.bptn.course.junit_books;

public class Book {
    // Define two private instance variables: title and price
    private String title;
    private double price;

    // Constructor that initializes the title and price
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Method to return book information as a string
    public String getBookInfo() {
        return title + " - $" + price;
    }
}