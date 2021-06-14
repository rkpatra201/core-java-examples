package com.java.inheritance;

public class App18 {
    public static void main(String[] args) {

        A a = new B();
        a.m1(); // parent
        a.m2(); // child

        B b = new B();
        b.m1(); // child
        b.m2(); // child

        a = new A();
        a.m1(); // parent
        a.m2(); // parent
    }

    private static class A{

        public static void m1(){
            System.out.println("parent static m1()");
        }


        public  void m2(){
            System.out.println("parent non-static m2()");
        }
    }

    private static class B extends A{
        public static void m1(){
            System.out.println("child static m1()");
        }


        public  void m2(){
            System.out.println("child non-static m2()");
        }
    }
}
