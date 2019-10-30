package com.java.creational.singleton;

public enum EnumSingleton {
    APP_SINGLETON{
        public int getX()
        {
            return 10;
        }
    };

    public abstract int getX();
}
