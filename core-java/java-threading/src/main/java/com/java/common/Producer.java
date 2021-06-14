package com.java.common;

import java.util.List;
import java.util.UUID;

public class Producer implements Runnable {
    private static final int MAX_SIZE = 10;
    private List<String> dataList;

    public Producer(List<String> dataList) {
        this.dataList = dataList;
    }

    @Override
    public void run() {
        while (true)
            produce();
    }

    private void produce() {
        synchronized (dataList) {
            String name = UUID.randomUUID().toString();
            dataList.add(name);
            dataList.notifyAll();
            System.out.println("producer produced and notify");
            ThreadUtils.sleep(500);
        }
        while (dataList.size() == MAX_SIZE) {
            synchronized (dataList) {
                try {
                    dataList.wait();
                    System.out.println("producer waiting");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
