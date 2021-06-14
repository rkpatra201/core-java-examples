package com.java.inheritance;

public class App2 {

    public static void main(String[] args) {

        A a = new B();
        a.m1(); // child class

        a = new A();
        a.m1(); // parent class
    }


    private static class A {

        private int i = 10;
        protected int j = 20;

        public void m1(){
            System.out.println("parent: "+i);
            System.out.println("parent: "+j);
        }
    }

    private static class B extends A
    {
        private int j = 30; // child variable hiding the parent variable
        public void m1(){
//            System.out.println("child: "+i); compilation error private variable
            System.out.println("child: "+j);
        }
    }


}
