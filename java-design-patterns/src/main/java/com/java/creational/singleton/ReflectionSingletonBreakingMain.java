package com.java.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonBreakingMain {
    public static void main(String[] args) throws IllegalAccessException,InstantiationException, InvocationTargetException {
        ReflectionSingletonBreaking reflectionSingletonBreaking = ReflectionSingletonBreaking.getInstance();
        System.out.println(reflectionSingletonBreaking.hashCode());

        Constructor[] constructors = ReflectionSingletonBreaking.class.getDeclaredConstructors();

        for(Constructor constructor:constructors)
        {
            constructor.setAccessible(true);
            Object object = constructor.newInstance();
            System.out.println(object.getClass());
            System.out.println(object.hashCode());
        }
    }
}
