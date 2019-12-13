package com.java.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StackWith2Queues {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        MyStack myStack = new MyStack();
        for (int data : arr) {
            myStack.push(data);
        }

        System.out.println("pop now");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(myStack.pop());
        }

    }
}

class MyStack {
    private Queue<Integer> primaryQueue = new LinkedList<>();
    private Queue<Integer> intermediateQueue = new LinkedList<>();

    public int pop() {
        int value = 0;
        if (primaryQueue.isEmpty()) {
            System.out.println("no data can be given");
        } else {
            int len = primaryQueue.size();
            for (int i = 1; i <= len; i++) {
                if (i < len) {
                    intermediateQueue.add(primaryQueue.poll());
                }

                if (i == len) {
                    value = primaryQueue.poll();
                    Queue<Integer> tempQueue = primaryQueue;
                    primaryQueue = intermediateQueue;
                    intermediateQueue = tempQueue;
                }
                // System.out.println("i "+i+" size: "+len);
            }
//            System.out.println(primaryQueue);
        }
        return value;
    }

    public void push(int data) {
        primaryQueue.add(data);
        System.out.println(primaryQueue);
    }
}
