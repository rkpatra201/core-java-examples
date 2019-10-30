package com.java.creational.singleton;

public class CloneSingletonMain {
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneSingleton cloneSingleton = CloneSingleton.getINSTANCE();
        System.out.println(cloneSingleton.hashCode());
        Object duplicateSingleton = cloneSingleton.clone();
        System.out.println(duplicateSingleton.hashCode());
    }
}
