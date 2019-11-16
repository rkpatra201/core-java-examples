package com.java.main;

import com.java.common.ThreadStateRunner;

public class ThreadStateMain {
    public static void main(String[] args) throws InterruptedException {
        ThreadStateRunner threadStateRunner = new ThreadStateRunner();
        Thread t1=new Thread(threadStateRunner);
        System.out.println(t1.getState());
        threadStateRunner.setT(t1);
        t1.start();
        Thread.sleep(1000);
        System.out.println(t1.getState());
        synchronized (threadStateRunner)
        {
            threadStateRunner.notify();
        }
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());


    }
}
