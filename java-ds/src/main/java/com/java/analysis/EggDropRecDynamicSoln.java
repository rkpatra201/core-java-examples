package com.java.analysis;

class EggDropRecDynamicSoln {
    public int calculate(int eggs, int floors) {

        int T[][] = new int[eggs + 1][floors + 1];
        int c = 0;
        for (int i = 0; i <= floors; i++) {
            T[1][i] = i; // with 1 egg max attempts if egge doesnt break is number of floors
        }

        for (int e = 2; e <= eggs; e++) {
            for (int f = 1; f <= floors; f++) {
                T[e][f] = Integer.MAX_VALUE;
                for (int k = 1; k <= f; k++) {
                    c = 1 + Math.max(T[e - 1][k - 1], T[e][f - k]);
                    T[e][f] = Math.min(T[e][f], c);
                }
            }
        }
        return T[eggs][floors];
    }

    public int eggDropRecursive(int n, int k) {
        // If there are no floors, then
        // no trials needed. OR if there
        // is one floor, one trial needed.
        if (k == 1 || k == 0)
            return k;

        // We need k trials for one egg
        // and k floors
        if (n == 1)
            return k;

        int min = Integer.MAX_VALUE;
        int x, res;

        // Consider all droppings from
        //1st floor to kth floor and
        // return the minimum of these
        // values plus 1.
        for (x = 1; x <= k; x++) {
            res = Math.max(eggDropRecursive(n - 1, x - 1),
                    eggDropRecursive(n, k - x));
            if (res < min)
                min = res;
        }

        return min + 1;
    }

    public static void main(String args[]) {
        EggDropRecDynamicSoln ed = new EggDropRecDynamicSoln();
        int r = ed.calculate(3, 100);
        System.out.println(r);
        r = ed.eggDropRecursive(3, 100);
        System.out.println(r);
    }
}