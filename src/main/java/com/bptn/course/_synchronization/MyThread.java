package com.bptn.course._synchronization;

public class MyThread extends Thread {

    SynchronizedPrinter printer;

    //#2 Parameterized constructor to initialize the printer instance variable
    public MyThread(SynchronizedPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        // #3 Call the printNumbers() method of the printer instance
        printer.printNumbers();//Print instance variable 
    }
}