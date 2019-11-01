package com.java.creational.abstrcat.factory;

public class CountryCarFactory {
    public static ICarFactory getCarFactoryByCountry(Country country) {
        switch (country) {
            case JAPAN:
                return new JapanCarFactory();
            case USA:
                return new UsaCarFactory();
            case INDIA:
                return new IndiaCarFactory();
        }
        return null;
    }
}
