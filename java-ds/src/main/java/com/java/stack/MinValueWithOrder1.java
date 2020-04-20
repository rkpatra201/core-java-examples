package com.java.stack;

import java.util.Stack;

public class MinValueWithOrder1 {

    private static Stack<Integer> currentStack = new Stack<>();
    private static Stack<Integer> minValueStack = new Stack<>();

    public static void main(String[] args) {
        int arr[] = {10, 8, 20, 45, 3, 3, 34, 1, 43, 22};

        addValue(10);
        addValue(8);
        addValue(20);
        addValue(45);
        addValue(3);
        addValue(3);
        addValue(34);
        popValue();
        addValue(1);
        addValue(43);
        addValue(22);
        popValue();
        popValue();
        popValue();
        popValue();
        popValue();
        popValue();
        popValue();

    }

    private static void addValue(int value) {

        currentStack.push(value);
        System.out.println("pushed: " + value);
        if (minValueStack.isEmpty()) {
            minValueStack.push(value);
        } else if (value <= minValueStack.peek()) { // less than equal to handle consecutive duplicates
            minValueStack.push(value);
        }
        displayMin();
    }


    private static void popValue() {
        if (!currentStack.isEmpty()) {
            int v1 = currentStack.peek();
            if (!minValueStack.isEmpty()) {
                int v2 = minValueStack.peek();
                if (v1 == v2) {
                    minValueStack.pop();
                }
            }
            currentStack.pop();
            System.out.println("pop: " + v1);
            displayMin();
        }
    }

    private static void displayMin() {
        System.out.println(currentStack);
        System.out.println(minValueStack);
        System.out.println("===================");
    }
}
