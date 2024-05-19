package com.murari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumofArray {
    public static int getSumofArrayElements(Integer[] intArray) {
        return Arrays.asList(intArray).stream().reduce(0, Integer::sum);
    }
}
