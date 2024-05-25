package com.murari;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class ReverseString {
    public static String reverseString(String inputString) {
        String s = inputString.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (a, b) -> b + a, (a1, b1) -> b1 + a1);
        System.out.println(s);
        return s;
    }

    public static char[] reverseChars(char[] s) {
        char[] result = String.valueOf(s).chars()
                .mapToObj(c -> (char) c)
                .reduce("", (a, b) -> b + a, (a1, b1) -> b1 + a1)
                .toCharArray();
        System.out.println(result);
        return result;

    }
}
