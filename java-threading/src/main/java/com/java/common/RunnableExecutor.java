package com.java.common;

import com.java.main.ExecutorServiceMain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RunnableExecutor implements Runnable {
    @Override
    public void run() {
        SimpleDateFormat sm = new SimpleDateFormat("hh:mm:ss");
        System.out.println("inside runnable: "+sm.format(new Date()));
        ExecutorServiceMain.cacheSize.add(Thread.currentThread().hashCode());
    }
}
