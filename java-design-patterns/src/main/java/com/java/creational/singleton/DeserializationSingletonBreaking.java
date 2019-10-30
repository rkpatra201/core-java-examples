package com.java.creational.singleton;

import java.io.Serializable;

public class DeserializationSingletonBreaking implements Serializable {
    private static final DeserializationSingletonBreaking INSTANCE = new DeserializationSingletonBreaking();

    public Object readResolve() {
        return INSTANCE;
    }

    private DeserializationSingletonBreaking() {

    }

    public static DeserializationSingletonBreaking getINSTANCE() {
        return INSTANCE;
    }
}
