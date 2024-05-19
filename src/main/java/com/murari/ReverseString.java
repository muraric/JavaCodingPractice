package com.murari;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class ReverseString {
    public static String reverseString(String inputString) {
        char[] charArray = inputString.toCharArray();
        return inputString.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (a, b) -> b + a, (a1, b1) -> b1 + a1);
    }
}
