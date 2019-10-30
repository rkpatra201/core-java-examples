package com.java.creational.singleton;

public class EagerLoadingSingleton {
    public static EagerLoadingSingleton INSTANCE_VAR = new EagerLoadingSingleton();

    private EagerLoadingSingleton()
    {

    }
    public static EagerLoadingSingleton getInstance()
    {
        return INSTANCE_VAR;
    }

}
