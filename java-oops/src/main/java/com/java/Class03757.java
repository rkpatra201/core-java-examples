package com.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Class03757 {
    public static void main(String[] args) {
        try {
            Constructor cons[] = PrivateConClass03757.class.getDeclaredConstructors();
            System.out.println(cons.length);
            for(Constructor c: cons)
            {
                c.setAccessible(true);
                Object o = null;
                try {
                    o = c.newInstance(new Object[]{1,"john"});
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                System.out.println(o.getClass());
            }
            }
             catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
