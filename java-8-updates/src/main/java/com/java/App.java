package com.java;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int arr[] = new int[]{100,10,1001,12};
        String[] str = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        System.out.println( "Hello World!" );
    }
}
