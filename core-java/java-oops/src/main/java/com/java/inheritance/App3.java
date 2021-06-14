package com.java.inheritance;

public class App3 {

    public static void main(String[] args) {

        A a = new B();

        System.out.println(a.j);// parent j

        B b = new B();
        System.out.println(b.j); // child j
    }


    private static class A {

        private int i = 10;
        protected int j = 20;


    }

    private static class B extends A {
        protected int j = 30; // child variable hiding the parent variable
    }


}
