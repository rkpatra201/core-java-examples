package com.java.inheritance;

public class App9 {

    public static void main(String[] args) {
        // cant create of abstract class, may or may not have abstract method
//        A a = new A();// compilation error
        A a = new B();
        a.m1();
    }


    private static abstract class A {

        public void m1() {
            System.out.println("from parent");
        }
    }

    private static class B extends A {

    }
}
