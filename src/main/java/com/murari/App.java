package com.murari;

import static com.murari.Palindrome.isPalindrome;
import static com.murari.ReverseString.reverseChars;
import static com.murari.ReverseString.reverseString;
import static com.murari.SumOfArray.sumOfArrayElements;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        reverseString("Murari");
        sumOfArrayElements(new Integer[]{1, 2, 3, 4});
        isPalindrome("ADDRRARRDDA");
        int count = 0;
        while (count < 5) {
            Singleton.create();
            count++;
        }
        reverseChars(new char[]{'a', 'b', 'c', 'd'});
        Fibonacci.fibonacci(8);
        DistributeCandies.distributeCandies(new int[]{6, 6, 6, 6});
    }
    }
