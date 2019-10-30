package com.java.creational.singleton;

public class DoubleCheckSingletonMain {
    public static void main(String[] args) {
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        System.out.println(doubleCheckSingleton.hashCode());

        doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        System.out.println(doubleCheckSingleton.hashCode());
    }
}
