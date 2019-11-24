package com.java.main;

public class MissingNumberInArrayMain {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 2, 4, 5, 6};


        int x1 = arr[0];// init low as x1
        for (int i = 1; i < n; i++) { // xor of all from 1 to end
            x1 = x1 ^ arr[i];
        }
        int x2 = 1;
        for (int i = 2; i < n + 2; i++) { // xor of index from 2 to n+2
            x2 = x2 ^ i;
        }
        System.out.println(x1+" "+x2);
        System.out.println(x1 ^ x2);
    }
}
