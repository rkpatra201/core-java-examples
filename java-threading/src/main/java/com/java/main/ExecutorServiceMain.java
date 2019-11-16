package com.java.main;

import com.java.common.RunnableExecutor;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceMain {

    public static final Set<Integer> cacheSize = new HashSet<>();
    public static void main(String[] args) {
       // cachedThreadPool();
        scheduledThreadPool();
    }

    public static void scheduledThreadPool()
    {
        ExecutorService executorService = Executors.newScheduledThreadPool(2);
        Runnable runnable = new RunnableExecutor();
        int i =0;
        while(i< 10) {
            ((ScheduledExecutorService) executorService).schedule(runnable,2, TimeUnit.SECONDS);
            i++;
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(cacheSize.size());
    }
    // create new thread if needed also uses free threads. kiils thread if they are idle for 60s
    public static void cachedThreadPool()
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable runnable = new RunnableExecutor();
        int i =0;
        while(i< 100) {
            executorService.submit(runnable);
            i++;
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(cacheSize.size());
    }
}
