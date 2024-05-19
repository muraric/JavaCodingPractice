package com.murari;

import static com.murari.Paliandrome.isPaliandrome;
import static com.murari.ReverseString.reverseString;
import static com.murari.SumOfArray.sumOfArrayElements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(reverseString("Murari"));
        System.out.println(sumOfArrayElements(new Integer[]{1, 2, 3, 4}));
        System.out.println(isPaliandrome("ADDRRARRDDA"));
    }
}
