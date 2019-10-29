package com.java.common;

import java.util.concurrent.BlockingQueue;

public class ConsumerQueue implements Runnable {
    private BlockingQueue<String> sharedQueue;

    public ConsumerQueue(BlockingQueue<String> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {

        while (true) {
            try {
                String data = sharedQueue.take();
                System.out.println("consumed: "+data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
