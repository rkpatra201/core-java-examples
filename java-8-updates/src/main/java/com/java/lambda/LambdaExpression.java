package com.java.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> nameList = Stream.of("john", "doe", "donald", "joe").collect(Collectors.toList());
        List<String> sortedList = nameList.stream().sorted(String::compareTo).collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("----------");
        // sorting using comparator with lambda
        nameList.stream().sorted((o1,o2)->{
            return o1.compareTo(o2);
        }).forEach(System.out::println);

        System.out.println("------------------");
        // thread creation with lambda
        Thread t1 = new Thread(()->{
            System.out.println("inside run method of thread");
        });
        t1.start();
    }
}
