package com.java.main;

import com.java.common.CountDownLatchRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchMain {
    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(3);
        List<CountDownLatchRunner> runners;
        runners = new ArrayList<>(Arrays.asList(new CountDownLatchRunner(countDownLatch), new CountDownLatchRunner(countDownLatch), new CountDownLatchRunner(countDownLatch)));

        Executor executor = Executors.newFixedThreadPool(runners.size());
        for(CountDownLatchRunner runner:runners)
        {
            ((ExecutorService) executor).submit(runner);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }

        System.out.println(countDownLatch.getCount());
        System.out.println(((ExecutorService) executor).isShutdown());
        ((ExecutorService) executor).shutdown();
        System.out.println(((ExecutorService) executor).isShutdown());

    }
}
