package com.java.common;

import java.util.List;

public class Consumer implements Runnable {
    private List<String> dataList;

    public Consumer(List<String> dataList) {
        this.dataList = dataList;
    }

    @Override
    public void run() {
        while (true)
            consume();
    }

    public void consume() {

        while (dataList.size() == 0) {
            synchronized (dataList) {
                try {
                    dataList.wait();
                    System.out.println("consumer waiting");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (dataList) {
            if(dataList.size() > 0) {
                dataList.remove(0);
                System.out.println("consumer consumed and notify"+Thread.currentThread().getName());
            }
            dataList.notifyAll();
            ThreadUtils.sleep(500);
        }
    }
}
