package com.java.common;

public class ThreadUtils {
    public static void sleep(long ms)
    {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
