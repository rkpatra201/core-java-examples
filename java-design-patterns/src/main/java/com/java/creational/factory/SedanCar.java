package com.java.creational.factory;

public class SedanCar implements Car {
    @Override
    public void drive() {
        System.out.println("driving: "+CarType.SEDAN);
    }
}
