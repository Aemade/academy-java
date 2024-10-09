package com.bptn.course._16_exceptions._02_checked;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class File {

    static final int MIN = 50;
    static final int MAX = 100;

    static int error = 0;
    static int counter = 0;

    /*
     * Open a file.
     */
    static BufferedReader open(String fileName, boolean... flag) throws FileNotFoundException {

        error = generateError(flag);

        InputStream input = new File().getClass().
                                     getClassLoader().
                                     getResourceAsStream(fileName);
        if (input == null) {
            throw new FileNotFoundException(fileName);
        }

        return new BufferedReader(new InputStreamReader(input));
    }

    /*
     * Read a line from the file.
     */
    static String read(BufferedReader file) throws IOException {
        /*
         * Simulates an IOException while reading the file.
         * Note that the "error" variable is initialized in the static block.
         */
        if (++counter >= error) {
            throw new IOException("Error on line (" + counter + ") !!!");
        }
        return file.readLine();
    }

    /*
     * Close the file.
     */
    static void close(BufferedReader file) {
        try {
            if (file != null) {
                file.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static int generateError(boolean... flag) {
        counter = 0;
        return (flag.length>0 && flag[0]) ? (int)(Math.random()*(MAX-MIN+1)+MIN): Integer.MAX_VALUE;
    }
}
