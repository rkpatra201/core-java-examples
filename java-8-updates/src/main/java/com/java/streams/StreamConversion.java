package com.java.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConversion {
    public static void main(String[] args) {
        streamToList();
    }

    public static void streamToList() {
        Stream<Integer> intStream = Stream.of(1, 2, 4, 5);
        List<Integer> list = intStream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list.getClass());
        list.forEach(System.out::println);
        System.out.println("------------");
        intStream = Stream.of(1, 2, 4, 5);
        Integer[] intEventNums = intStream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
        Stream.of(intEventNums).forEach(System.out::println);
    }

}
