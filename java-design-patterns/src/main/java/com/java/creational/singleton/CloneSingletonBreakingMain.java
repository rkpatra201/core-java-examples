package com.java.creational.singleton;

public class CloneSingletonBreakingMain {
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneSingletonBreaking cloneSingletonBreaking = CloneSingletonBreaking.getINSTANCE();
        System.out.println(cloneSingletonBreaking.hashCode());
        Object duplicateSingleton = cloneSingletonBreaking.clone();
        System.out.println(duplicateSingleton.hashCode());
    }
}
