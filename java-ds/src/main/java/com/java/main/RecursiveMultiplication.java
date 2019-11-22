package com.java.main;

public class RecursiveMultiplication {
    public static void main(String[] args) {

        System.out.println(div(11, 2));
    }

    public static int div(int x, int y)
    {
        if(x==0 || x==1)
        {
            return 0;
        }
        else
        {
            x=x-y;
            return div(x,y) + 1;
        }
    }
    public static int mul(int x, int y) {
        if (y == 0) {
            return 0;
        } else {
            y--;
            return mul(x, y) + x;
        }
    }
}
