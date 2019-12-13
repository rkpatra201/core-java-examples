package com.java.stack;

import java.util.Stack;

public class SortUsing2Stacks {
    public static void main(String[] args) {
        Stack<Integer> inputStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        int arr[] = {34, 3, 31, 98, 92, 23, 3};
        for (int data : arr) {
            inputStack.add(data);
        }


        while (!inputStack.isEmpty()) {
            int inputValue = inputStack.peek();
            if (tempStack.isEmpty()) {
                tempStack.add(inputValue);
                inputStack.pop();
            } else {
                while (!tempStack.isEmpty()) {
                    int tempValue = tempStack.peek();
                    if (tempValue < inputValue) {
                        inputStack.pop();
                        inputStack.add(tempValue);
                        inputStack.add(inputValue);
                        tempStack.pop();
                    } else {
                        tempStack.push(inputValue);
                        inputStack.pop();
                        break;
                    }
                }
            }
        }
        System.out.println(tempStack);
    }
}
