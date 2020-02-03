package com.java;

import com.java.inheritance.A030809;
import com.java.inheritance.B030809;

public class Class030809 {
    public static void main(String[] args) {
        A030809 a09 = new B030809(10);
        ((B030809) a09).display();
    }
}
