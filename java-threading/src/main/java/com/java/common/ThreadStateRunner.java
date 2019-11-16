package com.java.common;

public class ThreadStateRunner implements Runnable{
    private Thread t;

    public void setT(Thread t) {
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println(t.currentThread().getState());
        synchronized (this)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
