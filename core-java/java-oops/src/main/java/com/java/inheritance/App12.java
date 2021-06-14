package com.java.inheritance;

public class App12 {

    public static void main(String[] args) {

        A a = new B();
        a.m1();
        a.m2();
        System.out.println(A.x);
    }


    private interface A{

        int x = 10; // public static final

        void m1(); // public abstract
        void m2(); // public abstract

    }

    private static class B implements  A{
        @Override
        public void m1() {
            System.out.println("impl m1()");
        }

        @Override
        public void m2() {
            System.out.println("impl m2()");
        }
    }
}
