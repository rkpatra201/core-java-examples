package com.java.creational.factory;

public class HatchBackCar implements Car {
    @Override
    public void drive() {
        System.out.println("driving: "+CarType.HATCHBACK);
    }
}
