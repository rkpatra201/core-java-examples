package com.java.inheritance;

public class App8 {

    public static void main(String[] args) {
        // overriding from object class, inheriting to child if impl is absent
        A a = new B();
        System.out.println(a);

        a = new A();
        System.out.println(a);
    }


    private static class A {

        @Override
        public String toString() {
            return "custom: "+super.toString();
        }
    }

    private static class B extends A {

    }
}
