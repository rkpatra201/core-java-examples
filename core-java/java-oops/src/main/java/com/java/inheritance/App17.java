package com.java.inheritance;

public class App17 {

    public static void main(String[] args) {

        A a = new B();

        System.out.println(a instanceof A);
        System.out.println(a instanceof C);
        System.out.println(a instanceof B);
        System.out.println(a instanceof D);

        System.out.println((A)a);
        System.out.println((C)a);
        System.out.println((B)a);
        System.out.println((D)a); // ClassCastException
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

    private static class D extends B{

    }
}
