package com.java.creational.abstrcat.factory;

import com.java.creational.factory.Car;
import com.java.creational.factory.CarType;

public interface ICarFactory {
    Car getCar(CarType carType);
}
