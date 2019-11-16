package com.java.common;

import java.util.UUID;
import java.util.concurrent.Callable;

public class CallableRunner implements Callable<Integer> {
    private int i;

    public CallableRunner(int i) {
        this.i = i;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        System.out.println("completed: "+i);
        return i;
    }
}
