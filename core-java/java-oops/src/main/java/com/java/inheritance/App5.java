package com.java.inheritance;

public class App5 {

    public static void main(String[] args) {


    }


    private static class A {

        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }


    }

    private static class B extends A {
        //        private final int i =10;
        private int i;
        private int j;

        public B() {
            // call to super constructor or this constructor is first statement
            super(10, 20); // or this(10,20);
        }

        public B(int i, int j) {
            super(i, j);
            this.i = i + 10;
            this.j = j + 10;
        }

    }


}
