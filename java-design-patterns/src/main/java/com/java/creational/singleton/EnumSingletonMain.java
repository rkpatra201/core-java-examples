package com.java.creational.singleton;

public class EnumSingletonMain {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.APP_SINGLETON;
        System.out.println(enumSingleton.hashCode());

        enumSingleton = EnumSingleton.APP_SINGLETON;
        System.out.println(enumSingleton.hashCode());
        System.out.println(enumSingleton.getX());
    }
}
