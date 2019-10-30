package com.java.creational.singleton;

public class LazyLoadingSingletonMain {
    public static void main(String[] args) {
        LazyLoadingSingleton lazyLoadingSingleton = LazyLoadingSingleton.getInstance();
        System.out.println(lazyLoadingSingleton.hashCode());

        lazyLoadingSingleton = LazyLoadingSingleton.getInstance();
        System.out.println(lazyLoadingSingleton.hashCode());
    }
}
