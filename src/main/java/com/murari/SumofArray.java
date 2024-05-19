package com.murari;

import java.util.Arrays;

public class SumofArray {
    public static int getSumofArrayElements(Integer[] intArray) {
        return Arrays.stream(intArray).reduce(0, Integer::sum);
    }
}
