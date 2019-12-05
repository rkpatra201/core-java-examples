package com.java.common;

import java.util.Date;

public class ExecutorShutdownRunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println(new Date() + " " + Thread.currentThread() + " starting");
        try {
            Thread.sleep(4000);
            System.out.println(new Date() + " " + Thread.currentThread() + " wakeup");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Date() + " " + Thread.currentThread() + " completed");
    }

}
