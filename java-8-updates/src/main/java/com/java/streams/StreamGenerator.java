package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class StreamGenerator {
    public static void main(String[] args) {
        m1();
    }
    public static void m1()
    {
        Stream<Integer> streams = Stream.of(1,2,2,3,4);
        streams.forEach(System.out::println);
        System.out.println("-------------");
        streams = Stream.of(new Integer[]{1,2,3,4});
        streams.forEach(System.out::println);
        System.out.println("------------------------");
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,5,6));
        list.stream().forEach(System.out::println);
        System.out.println("---------------------");
        // infinite loop with each loop creates a new Date() object.
        //Stream.generate(()-> {return new Date();}).forEach(System.out::println);
    }
}
