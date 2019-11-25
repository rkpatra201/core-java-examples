package com.java.arrays.binary;

public class SumOfDigitsHavingEvenNumberOf1s {
    public static void main(String[] args) {
        int count = getCountOfOne(15);
        int number=1235;
        int sum =0;
        while(number>0) {
            int rem = number%10;
            count = getCountOfOne(rem);
            if (count != 0 && count % 2 == 0) {
                sum = sum+rem;
            }
            number = number/10;
        }
        System.out.println(sum);
    }
    private static int getCountOfOne(int number)
    {
        int count = 0;
        while(number > 0)
        {
            int rem = number%2;
            if(rem==1)
            {
                count++;
            }
            number = number/2;
        }
        return count;
    }
}
