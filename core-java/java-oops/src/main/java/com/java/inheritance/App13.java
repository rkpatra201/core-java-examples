package com.java.inheritance;

public class App13 {

    public static void main(String[] args) {

        A a = new B();
        a.m1();
        a.m2();
        System.out.println(A.x);

        C c = (C)a;
        c.m3();
        c.m4();
    }


    private interface A{

        int x = 10; // public static final

        void m1(); // public abstract
        void m2(); // public abstract

    }

    private static abstract class C implements A{
        public void m3(){
            System.out.println("from C m3()");
        }
        public abstract void m4();
    }

    private static class B extends  C{
        @Override
        public void m1() {
            System.out.println("impl m1()");
        }

        @Override
        public void m2() {
            System.out.println("impl m2()");
        }

        @Override
        public void m4() {
            System.out.println("impl m4()");
        }
    }
}
