package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamOperations {
    private static List<String> courseList = new ArrayList<String>();

    static {
        courseList.add("MBA");
        courseList.add("MCA");
        courseList.add("BSC");
        courseList.add("PHARMACY");
    }

    public static void m6()
    {
       Optional<String> reduced = courseList.stream().reduce((s1, s2)->s1+"%%%%"+s2);
       reduced.ifPresent(System.out::println);

    }
    public static void m5()
    {
        // min and max with comparator
        String result = courseList.stream().min((o1,o2)->{
           return -o1.compareTo(o2);
        }).get();
        System.out.println("minValue: "+result);

        result = courseList.stream().max((o1,o2)->{
            return -o1.compareTo(o2);
        }).get();
        System.out.println("maxValue: "+result);
    }
    public static void m4()
    {
        String result = courseList.stream().findAny().get();
        System.out.println("findAny: "+result);
        result = courseList.stream().findFirst().get();
        System.out.println("findFirst: "+result);
    }
    public static void m3() {
        // count
        long matchedCount = courseList.stream().filter(e -> e.startsWith("M")).count();
        System.out.println(matchedCount);
    }

    public static void m2() {
        // anyMatch, allMatch, noneMatch
        boolean flag = courseList.stream().anyMatch(e -> e.startsWith("M"));
        System.out.println("anyMatch: " + flag);
        flag = courseList.stream().allMatch(e -> e.startsWith("B"));
        System.out.println("allMatch: " + flag);
        flag = courseList.stream().noneMatch(e -> e.startsWith("D"));
        System.out.println("noneMatch: " + flag);
    }

    public static void m1() {
        // filter
        courseList.stream().filter(e -> {
            return e.startsWith("M");
        }).forEach(System.out::println);

        //map
        courseList.stream().filter(e -> {
            return e.startsWith("M");
        }).map(String::toLowerCase).forEach(System.out::println);

        //sorting
        courseList.stream().sorted().forEach(System.out::println);

        // sorting with comparator
        courseList.stream().sorted(((o1, o2) -> {
            if (o1.length() == o2.length()) { // when length same it reverse the order
                return -o1.compareTo(o2);
            }
            return o1.compareTo(o2);
        })).forEach(System.out::println);
    }

    public static void main(String[] args) {
        // m1();
       // m2();
       // m3();
      //  m4();
       // m5();
        m6();
    }
}
