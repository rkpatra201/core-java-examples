package com.java.main;

import com.java.common.CallableRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableMain {
    public static void main(String[] args) {
        FutureTask<Integer>[] futureTasks = new FutureTask[5];
        for(int i =0; i<5;i++) {
            CallableRunner callableRunner = new CallableRunner(i);
            FutureTask<Integer> futureTask = new FutureTask<>(callableRunner);
            futureTasks[i] = futureTask;
            Thread t = new Thread(futureTask);
            t.start();
        }
        try {
            for(FutureTask<Integer> futureTask: futureTasks) {
                System.out.println(futureTask.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
