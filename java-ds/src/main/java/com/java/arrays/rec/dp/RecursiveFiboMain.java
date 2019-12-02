package com.java.arrays.rec.dp;

public class RecursiveFiboMain {
    public static void main(String[] args) {
        getFibo(5, 0, 1);
    }

    private static void getFibo(int numberOfFibElements, int prev, int next) {
        if (numberOfFibElements==0) {
            return;
        }
        System.out.print(prev+",");
        int temp = prev;
        prev=next;
        next = temp+next;
        numberOfFibElements=numberOfFibElements-1;
        getFibo(numberOfFibElements, prev, next);
    }

}
