package com.java.stack;

import java.util.Stack;

public class ReverseStackMain {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        reverseStack(s);
        System.out.println(s);
    }


    private static void reverseStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int val = s.pop();
            reverseStack(s);
            insertBottom(val, s);
        }
    }

    private static void insertBottom(int val, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(val);
        } else {
            int tempVal = s.pop();
            insertBottom(val, s);
            s.push(tempVal);
        }
    }

}
