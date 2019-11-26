package com.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int n =9;
        int count =0;
        while(n > 0)
        {
            int rem = n%2;
            if(rem==1)
            {
                count++;
            }
            n = n/2;
        }
        System.out.println(count);
        System.out.println( "Hello World!" );
    }
}
