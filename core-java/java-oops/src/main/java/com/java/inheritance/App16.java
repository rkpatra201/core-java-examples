package com.java.inheritance;

public class App16 {

    public static void main(String[] args) {

        A a = new B();
        a.m1();
        a.m2();
        System.out.println(A.x);

        C c = (C) a;
        c.m3();
    }


    private interface A {

        int x = 10; // public static final

        void m1(); // public abstract

        void m2(); // public abstract

    }

    private interface C extends A {
        void m3();

    }

    private static class B implements C {
        @Override
        public void m1() {
            System.out.println("impl m1()");
        }

        @Override
        public void m2() {
            System.out.println("impl m2()");
        }

        @Override
        public void m3() {
            System.out.println("impl m3()");
        }
    }
}
