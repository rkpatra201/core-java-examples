package com.java.creational.factory;

public class SuvCar implements Car {
    @Override
    public void drive() {
        System.out.println("driving: "+CarType.SUV);
    }
}
