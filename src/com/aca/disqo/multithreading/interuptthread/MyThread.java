package com.aca.disqo.multithreading.interuptthread;

public class MyThread extends Thread {

    private String name;
    private boolean isAlive = true;

    MyThread(final String name) {
        this.name = name;
        System.out.println("new Thread" + " " + this.name);
    }

    @Override
    public void run() {
        int i = 0;
        while (isAlive) {
            System.out.println(name + "isRunning " + i);
            i++;
        }

        System.out.println(name + " stopped");
    }

    public void stopMyThread() {
        this.isAlive = false;
    }
}
