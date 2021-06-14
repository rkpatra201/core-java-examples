package com.java.inheritance;

public class App7 {

    public static void main(String[] args) {
        // only one object called in inheritance constructor chaining
        A a = new B();
    }


    private static class A {
        public A() {
            System.out.println("parent constructor"+ this.hashCode());
        }
    }

    private static class B extends A {

        public B() {
            System.out.println("child constructor"+ this.hashCode());
        }
    }
}
