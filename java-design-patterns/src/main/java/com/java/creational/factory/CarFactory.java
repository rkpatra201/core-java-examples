package com.java.creational.factory;

public class CarFactory {
    public static Car getCar(CarType carType) {
        switch (carType) {
            case HATCHBACK:
                return new HatchBackCar();
            case SEDAN:
                return new SedanCar();
            case SUV:
                return new SuvCar();
        }
        return null;
    }
}
