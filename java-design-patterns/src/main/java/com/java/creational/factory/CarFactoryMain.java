package com.java.creational.factory;

public class CarFactoryMain {
    public static void main(String[] args) {
        Car car = CarFactory.getCar(CarType.SEDAN);
        car.drive();
    }
}
