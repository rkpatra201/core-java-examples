package com.java.main;

public class DeadLockMain {
    public static void main(String[] args) {
        Task t1 = new Task(true);
        Task t2 = new Task(false);

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();

    }
}

class Task implements Runnable {
    private boolean flag;

    public Task(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            m1();
        } else {
            m2();
        }
    }

    public void m1() {
        System.out.println("in m1");
        synchronized (String.class) {
            System.out.println("in m1 after string");
            sleep(500);
            synchronized (Object.class) {
                System.out.println("in m1 after object");

            }
        }
    }


    public void m2() {
        System.out.println("in m2");
        synchronized (Object.class) {
            System.out.println("in m2 after object");
            sleep(500);
            synchronized (String.class) {
                System.out.println("in m2 after string");

            }
        }
    }

    private static void sleep(long ms)
    {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
