package com.hrvojepasaricek.packagechallenge;

public class Series {
    public static long nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 0;
        }

        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int fibonacci(int n) {
        int f1 = 1;
        int f2 = 0;
        int fn = 0;

        for (int i = 1; i <= n; i++) {
            f2 = f1;
            f1 = fn;
            fn = f1 + f2;
        }
        return fn;
    }
}
