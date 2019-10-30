package com.java.creational.singleton;

public class EagerLoadingMain {
    public static void main(String[] args) {

        EagerLoadingSingleton eagerLoadingSingleton = EagerLoadingSingleton.getInstance();
        System.out.println(eagerLoadingSingleton.hashCode());

        eagerLoadingSingleton = EagerLoadingSingleton.getInstance();
        System.out.println(eagerLoadingSingleton.hashCode());
    }
}
