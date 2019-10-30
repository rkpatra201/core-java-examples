package com.java.creational.singleton;

public class ReflectionSingletonBreaking {
    private static ReflectionSingletonBreaking ourInstance = new ReflectionSingletonBreaking();

    public static ReflectionSingletonBreaking getInstance() {
        return ourInstance;
    }

    private ReflectionSingletonBreaking() {
    }
}
