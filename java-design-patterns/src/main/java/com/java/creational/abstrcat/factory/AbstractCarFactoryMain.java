package com.java.creational.abstrcat.factory;

import com.java.creational.factory.Car;
import com.java.creational.factory.CarType;

public class AbstractCarFactoryMain {
    public static void main(String[] args) {
        ICarFactory carFactory = CountryCarFactory.getCarFactoryByCountry(Country.INDIA);
        System.out.println(carFactory.getClass());
        Car car = carFactory.getCar(CarType.SEDAN);
        car.drive();
    }
}
