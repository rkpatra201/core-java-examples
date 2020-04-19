package com.java.stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 1, 100};//{4, 5, 2, 25};

        Stack<Integer> s = new Stack<>();

        s.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int nextValue = arr[i];
            while (nextValue > s.peek()) { // because there may be many elements in stack
                System.out.println(s.peek() + " greater element " + nextValue);
                s.pop();
                if (s.isEmpty()) {
                    break;
                }
            }
            s.push(nextValue);
        }

        for (int i : s) {
            System.out.println(i + " greater element -1");
        }
    }
}
