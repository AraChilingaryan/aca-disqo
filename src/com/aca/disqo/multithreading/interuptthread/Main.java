package com.aca.disqo.multithreading.interuptthread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("First thread");
        MyThread myThread1 = new MyThread("Second thread");

        try {
            Thread.sleep(500);
            myThread.start();
            myThread1.start();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.stopMyThread();
        myThread1.stopMyThread();
    }
}
