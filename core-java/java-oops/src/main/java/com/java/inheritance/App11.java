package com.java.inheritance;

public class App11 {

    public static void main(String[] args) {
        // cant create of abstract class, may or may not have abstract method
//        A a = new A();// compilation error
        A a = new B();
        a.m1();
        a.m2();

        C c = (C)a;
        c.m3();
    }


    private static abstract class A {

        public void m1() {
            System.out.println("from parent");
        }
        public abstract void m2() ; // child concrete class must override but child abstract class may or may not override
    }

    private static class B extends C {

        @Override
        public void m2() {
            System.out.println("child m2");
        }

        @Override
        public void m3() {
            System.out.println("child m3");
        }
    }

    private abstract static class C extends A{
        public abstract void m3();
    }
}
