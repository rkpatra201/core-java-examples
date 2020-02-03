package com.java.inheritance;

public class Test {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.s);
    }
}

class A {
    String s = "classA";
}

class B extends A {
    String s = "classB";

    {
        s="test";
        System.out.println(super.s);
    }
}

class C extends B
{
    String s ="classC";
    {
        System.out.println(super.s);
    }
}