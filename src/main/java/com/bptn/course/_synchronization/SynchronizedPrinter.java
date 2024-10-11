package com.bptn.course._synchronization;

public class SynchronizedPrinter {

    // No-argument constructor
    public SynchronizedPrinter() {
        // Default constructor
    }

    //#1 Synchronized to print numbers
    
    public void printNumbers() {
        synchronized (this) {
            System.out.println("Inside of the synchronized block.");
            for (int i = 0; i < 5; i++) {
                System.out.println(i + 1);
                
                try {
                    Thread.sleep(500); // Pause for 500 milliseconds
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}