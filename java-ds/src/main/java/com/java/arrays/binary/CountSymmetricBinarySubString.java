package com.java.arrays.binary;

import java.util.Arrays;
import java.util.Stack;

public class CountSymmetricBinarySubString {

    //"100111000101000"
    // substrings can be repeated
    // substring of type 1_0: 10(1),111000(3),10(1),10(1) = 6
    // substring of type 0_1: 0011(2), 01(1), 01(1)  =4
    // total 6+4=10
    public static void main(String[] args) {
        String s = "100111000101000";
      //  s = "01";
        //    s = "11100001";
        // find substrings which are of type 1,0
        // find substrings which are of type 0,1
        int oneZero = countSymmetricSubString2(s, '1');
        int zeroOne = countSymmetricSubString2(s, '0');
        System.out.println(oneZero + zeroOne);
        countSymetricSubStringWithStack(s,'1');// 1_0
        countSymetricSubStringWithStack(s,'0');// 0_1
    }

    private static void countSymetricSubStringWithStack(String input, char binary)
    {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char c : input.toCharArray())
        {
            if(c==binary)
            {
                stack.push(c);
            }else if(!stack.isEmpty())
            {
               char pop = stack.pop();
               if(c!=pop)
               {
                   count = count+1;
               }
            }
        }
        System.out.println(count);
    }
    private static int countSymmetricSubString2(String s, char currentBinaryType) {
        int count = 0;
        int numberOfCurrentBinaryTypeTraversed = 0;
        boolean isOtherBinary = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] == currentBinaryType) {
                if (isOtherBinary || i == 0) {
                    numberOfCurrentBinaryTypeTraversed = 1;
                    isOtherBinary = false;
                } else {
                    numberOfCurrentBinaryTypeTraversed++;
                }
            } else {
                if (numberOfCurrentBinaryTypeTraversed > 0) {
                    count++;
                    numberOfCurrentBinaryTypeTraversed--;
                }
                isOtherBinary = true;
            }
        }
        System.out.println(count);
        return count;
    }

    private static void countSymmetricSubString(String s) {
        char[] oneZero = {'1', '0'};
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char tempArr[] = {s.toCharArray()[i], s.toCharArray()[i + 1]};
            if (Arrays.equals(oneZero, tempArr)) {
                count++;
                int prev = i;
                int next = i + 1;
                while (prev > 0 && s.toCharArray()[--prev] == '1' && s.toCharArray()[++next] == '0' && next < s.toCharArray().length) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
