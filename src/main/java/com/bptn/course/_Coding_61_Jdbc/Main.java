package com.bptn.course._Coding_61_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
    // Create an instance of FeedAppClass
    FeedAppClass jdbc = new FeedAppClass();
    
    // Establish the database connection
    Connection conn = jdbc.createConnection();
    
    // Insert a new user into the User table
    jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);
    
    // Close the database connection
    jdbc.closeConnection(conn);
}
}