package io.github.fatihbozik.ch4.stream;

import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) {
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
    }
}
