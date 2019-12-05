package com.java.main;

import com.java.common.ExecutorShutdownRunnableTask;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorShutdownMain {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Runnable task1 = new ExecutorShutdownRunnableTask();
        Runnable task2 = new ExecutorShutdownRunnableTask();

        service.submit(task1);
        service.submit(task2);
        int i =0;
        while(i<2)
        {
            Runnable task3 = new ExecutorShutdownRunnableTask();
            service.submit(task3);
            i++;
        }


        System.out.println("about to calling shutdown");
        service.shutdown();

//        service.shutdownNow().forEach(e->{
//            System.out.println("task: "+e);
//        });
        System.out.println("shutdown called");

        try {
            System.out.println("await termination calling: "+new Date());
            service.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("not comming here: "+new Date());
    }
}
