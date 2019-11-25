package com.java.common;

import com.java.main.ExecutorServiceMain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class RunnableExecutor implements Runnable {

    private Set<Thread> threadSet;

    public RunnableExecutor(Set<Thread> threadSet) {
        this.threadSet = threadSet;
    }

    @Override
    public void run() {
        SimpleDateFormat sm = new SimpleDateFormat("hh:mm:ss");
        System.out.println("inside runnable: "+sm.format(new Date()));
        ExecutorServiceMain.cacheSize.add(Thread.currentThread().hashCode());
        threadSet.add(Thread.currentThread());
    }
}
