package com.java.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedStreamOperations {
    public static void main(String[] args) {
        // boxed stream for stream of primitives to resolve compilation error
        Stream<String> streams = Stream.of("a", "b", "c");
        Stream<Integer> intStreams = IntStream.of(1, 2, 3, 4).boxed();
        intStreams.forEach(System.out::println);
    }
}
