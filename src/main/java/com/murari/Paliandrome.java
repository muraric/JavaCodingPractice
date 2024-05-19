package com.murari;

import static com.murari.ReverseString.reverseString;

public class Paliandrome {
    public static boolean isPaliandrome(String string){
        return reverseString(string).equals(string);
    }
}
