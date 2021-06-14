package com.java.inheritance;

public class App4 {

    public static void main(String[] args) {

        A a = new B(10,20);

        System.out.println(a.sum()); // from child: 50

        a = new A(10,20);
        System.out.println(a.sum()); // from parent: 30

        B b = new B(1,2);
        System.out.println(b.sum()); // from child: 23
        System.out.println(b.superSum()); // from child to parent with super: 3
    }


    private static class A {

        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int sum()
        {
            return this.i + this.j;
        }


    }

    private static class B extends A {
        //        private final int i =10;
        private int i;
        private int j;

        public B(int i, int j) {
            super(i, j);
            this.i = i + 10;
            this.j = j + 10;
        }

        @Override
        public int sum() {
            return this.i+this.j;
        }

        public int superSum()
        {
            return super.sum();
        }
    }


}
