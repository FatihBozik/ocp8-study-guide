package io.github.fatihbozik.ch4.stream;

import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();          // count = 0
        Stream<Integer> singleElement = Stream.of(1);   // count = 1;
        Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3;
    }
}
