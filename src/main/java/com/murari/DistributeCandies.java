package com.murari;

import java.util.Arrays;

public class DistributeCandies {
    public static int result = 0;

    public static int distributeCandies(int[] candyType) {
        result = (int) Arrays.stream(candyType).distinct().count();
        if (candyType.length / 2 <= result) {
            result = candyType.length / 2;
        }
        System.out.println(result);
        return result;
    }
}
