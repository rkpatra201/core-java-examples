package com.java.creational.abstrcat.factory;

import com.java.creational.factory.Car;
import com.java.creational.factory.CarFactory;
import com.java.creational.factory.CarType;

public class UsaCarFactory implements ICarFactory {
    @Override
    public Car getCar(CarType carType) {
        return CarFactory.getCar(carType);
    }
}
