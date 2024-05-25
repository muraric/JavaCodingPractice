package com.murari;

import static com.murari.ReverseString.reverseString;

public class Palindrome {
    public static void isPalindrome(String string) {
        boolean result = reverseString(string).equals(string);
        System.out.println("Palindrome Check for " + string + " : " + result);
    }
}
