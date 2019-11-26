package com.java.arrays.common;

public class SpreedSheetNotations {
    public static void main(String[] args) {
        columnNumberToString(703);
        columnStringToNumber("AAA");
    }
    public static void columnNumberToString(int n)
    {
        StringBuffer sb = new StringBuffer();
        while(n > 0)
        {
            int rem = (n-1)%26;
            sb.append( (char) ((rem)+'A'));
            n = (n-1)/26;
        }
        System.out.println(sb.reverse().toString());
    }

    public static void columnStringToNumber(String name) {
        int number = 0;
        for (int i = 0; i < name.length(); i++) {
            number = number * 26 + (name.charAt(i) - ('A' - 1));
        }
        System.out.println(number);
    }
}
