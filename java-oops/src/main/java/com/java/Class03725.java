package com.java;

public class Class03725 {
    public static void main(String[] args) {
        Class03725 class03725=new Class03725();
        System.out.println("----------");
        Class03725 class03725_1=new Class03725(10);
    }

    int x;

    static {
        System.out.println("s1");
    }

    static {
        System.out.println("s2");
    }
    {
        System.out.println("h1");
    }
    {
        System.out.println("h2");
    }

    public Class03725(int x) {
        this(); // never invokes non-static block
        this.x = x;
        System.out.println("con(x)");
    }

    public Class03725() {
        System.out.println("con()");
    }
}
