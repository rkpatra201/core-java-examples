package com.java.creational.singleton;

public class LazyLoadingSingleton {
    private static LazyLoadingSingleton INSTANCE_VAR;

    private LazyLoadingSingleton()
    {

    }
    public static LazyLoadingSingleton getInstance()
    {
        if(INSTANCE_VAR==null)
        {
            INSTANCE_VAR = new LazyLoadingSingleton();
        }
        return INSTANCE_VAR;
    }
}
