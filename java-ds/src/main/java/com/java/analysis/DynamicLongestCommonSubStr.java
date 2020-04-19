package com.java.analysis;

public class DynamicLongestCommonSubStr {
    public static void main(String[] args) {
        longestCommonSubStr("abc","abd");
    }

    private static void longestCommonSubStr(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int res = 0;
        int LONGEST[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == 0 || j == 0)
                    LONGEST[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    LONGEST[i][j] = 1 + LONGEST[i - 1][j - 1];
                    res = Math.max(res, LONGEST[i][j]);
                } else
                    LONGEST[i][j] = 0;
            }
        }
        System.out.println(res);
    }
}
