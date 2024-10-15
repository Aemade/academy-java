package com.bptn.course.junit_books;

public class Textbook extends Book {
    // Private int instance variable for the edition
    private int edition;

    // Constructor for Textbook that includes title, price, and edition
    public Textbook(String title, double price, int edition) {
        // Call superclass constructor with title and price
        super(title, price);
        this.edition = edition;
    }

    // Method to return the edition of the textbook
    public int getEdition() {
        return edition;
    }

    // Override the getBookInfo method to include edition information
    @Override
    public String getBookInfo() {
        // Call superclass getBookInfo and append the edition, with no spaces and proper format
        return super.getTitle() + "-" + super.getPrice() + "-" + edition;
    }

    // Method to determine if this textbook can substitute for another textbook
    public boolean canSubstituteFor(Textbook other) {
        // Conditions: same title and this edition >= other edition
        return this.getTitle().equals(other.getTitle()) && this.edition >= other.getEdition();
    }
}