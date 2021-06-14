package com.java.main;

import com.java.common.Consumer;
import com.java.common.Producer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerListMain {
    public static void main(String[] args) {
        List<String> dataList = new ArrayList<>();
        Producer producer = new Producer(dataList);
        Thread producerThread = new Thread(producer);
        producerThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 1; i < 50; i++) {
            Consumer consumer = new Consumer(dataList);
            Thread consumerThread = new Thread(consumer,"consumer-"+i);
            consumerThread.start();
        }
    }
}
