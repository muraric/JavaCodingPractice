package com.murari;

public class Fibonacci {
    private static int result = 0;

    public static int fibonacci(int n) {
        if (n <= 1) {
            result = n;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }
        System.out.println("Fibonacci of " + n + ": " + result);
        return result;
    }
}
