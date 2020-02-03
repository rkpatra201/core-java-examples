package com.java.matrix;

import java.sql.SQLOutput;

public class CongruenceMain {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr = new int[][]{{3, 7}, {2, 5}, {2, 3},{11,18},{29,33}};

        long timeMs = System.currentTimeMillis();

        // 7,5,3
        int count = 0;
        for(int i =1; count < 10; i++) {
            boolean result = true;

            for (int ar[] : arr) {
                boolean flag1 = (i % ar[1]) == (ar[0] % ar[1]);
                result = result && flag1;
            }
            if(result == true)
            {
                System.out.println(i);
                count = count+1;
            }
        }
        System.out.println(System.currentTimeMillis() - timeMs);
    }
}
