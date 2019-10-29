package com.java.common;

import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable {
    private BlockingQueue<String> sharedQueue;

    public ProducerQueue(BlockingQueue<String> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("producing: "+i);
                sharedQueue.put("data "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
