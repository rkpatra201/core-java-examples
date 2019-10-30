package com.java.creational.singleton;


import java.io.*;

public class DeserializationSingletonBreakingMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DeserializationSingletonBreaking deserializationSingletonBreaking = DeserializationSingletonBreaking.getINSTANCE();

        System.out.println(deserializationSingletonBreaking.hashCode());
        File file = new File("singleton.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        objectOutputStream.writeObject(deserializationSingletonBreaking);
        objectOutputStream.close();
        fos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        Object object = objectInputStream.readObject();
        System.out.println(object.getClass());
        System.out.println(object.hashCode());
    }
}
