package com.java.analysis;

public class DynamicLongestCommonSubSequence {
    public static void main(String[] args) {
        lcs("AGGTAB", "GXTXAYB");
        System.out.println(lcs("AGGTAB", "GXTXAYB",6,7));
    }

    private static int lcs(String s1,String s2,int i , int j)
    {
        if(i==0 || j ==0)
            return 0;
        else if(s1.charAt(i-1) == s2.charAt(j-1))
            return 1 + lcs(s1,s2,i-1,j-1);
        else
            return Math.max(lcs(s1,s2,i,j-1),lcs(s1,s2,i-1,j));
    }
    private static void lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int lcsArr[][] = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    lcsArr[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lcsArr[i][j] = lcsArr[i - 1][j - 1] + 1;
                } else {
                    lcsArr[i][j] = Math.max(lcsArr[i - 1][j], lcsArr[i][j - 1]);
                }
            }
        }
        System.out.println(lcsArr[m][n]);
    }
}
