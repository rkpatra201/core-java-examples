package com.java.inheritance;

public class App6 {

    public static void main(String[] args) {
        // parent constructors called first, then child constructor
        A a = new B();
    }


    private static class A {
        public A() {
            System.out.println("parent constructor");
        }
    }

    private static class B extends A {

        public B() {
            System.out.println("child constructor");
        }
    }
}
