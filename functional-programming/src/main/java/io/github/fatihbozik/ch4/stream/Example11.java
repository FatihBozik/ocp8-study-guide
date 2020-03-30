package io.github.fatihbozik.ch4.stream;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Example11 {
    public static void main(String[] args) {
        Stream<Integer> streamOfInteger = Stream.of(3, 5, 6);
        System.out.println(streamOfInteger.reduce(1, (a, b) -> a * b)); // 90

        BinaryOperator<Integer> multiplication = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        empty.reduce(multiplication).ifPresent(System.out::println); // No output

        Stream<Integer> oneElement = Stream.of(3);
        oneElement.reduce(multiplication).ifPresent(System.out::println); // 3

        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        threeElements.reduce(multiplication).ifPresent(System.out::println); // 90
    }
}
