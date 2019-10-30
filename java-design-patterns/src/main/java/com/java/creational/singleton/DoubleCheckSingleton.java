package com.java.creational.singleton;

public class DoubleCheckSingleton {
    private static DoubleCheckSingleton INSTANCE_VAR;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (INSTANCE_VAR == null) {
            synchronized (DoubleCheckSingleton.class) {
                INSTANCE_VAR = new DoubleCheckSingleton();
            }
        }
        return INSTANCE_VAR;
    }
}
