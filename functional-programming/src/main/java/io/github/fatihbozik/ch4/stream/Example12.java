package io.github.fatihbozik.ch4.stream;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Example12 {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiplication = (a, b) -> a * b;
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        Integer result = threeElements.reduce(1, multiplication, multiplication);
        System.out.println(result); // 90
    }
}
