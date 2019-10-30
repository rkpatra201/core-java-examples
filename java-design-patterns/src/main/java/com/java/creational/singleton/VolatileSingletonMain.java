package com.java.creational.singleton;

public class VolatileSingletonMain {
    public static void main(String[] args) {
        VolatileSingleton volatileSingleton = VolatileSingleton.getInstance();
        System.out.println(volatileSingleton.hashCode());
        volatileSingleton = VolatileSingleton.getInstance();
        System.out.println(volatileSingleton.hashCode());
    }
}
