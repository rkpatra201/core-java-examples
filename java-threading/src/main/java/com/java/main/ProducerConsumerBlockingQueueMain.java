package com.java.main;

import com.java.common.ConsumerQueue;
import com.java.common.ProducerQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueueMain {
    public static void main(String[] args) {
        BlockingQueue<String> sharedQueue = new LinkedBlockingQueue<>();
        ProducerQueue producerQueue = new ProducerQueue(sharedQueue);
        ConsumerQueue consumerQueue = new ConsumerQueue(sharedQueue);

        Thread producerThread = new Thread(producerQueue);
        Thread consumerThread = new Thread(consumerQueue);
        producerThread.start();
        consumerThread.start();
    }
}
