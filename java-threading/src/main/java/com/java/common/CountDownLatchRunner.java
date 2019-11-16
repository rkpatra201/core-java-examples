package com.java.common;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchRunner implements Runnable {
    private CountDownLatch countDownLatch;

    public CountDownLatchRunner(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        countDownLatch.countDown();
    }
}
