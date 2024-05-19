package com.murari;

import java.util.Arrays;

public class SumOfArray {
    public static int sumOfArrayElements(Integer[] intArray) {
        return Arrays.stream(intArray).reduce(0, Integer::sum);
    }
}
