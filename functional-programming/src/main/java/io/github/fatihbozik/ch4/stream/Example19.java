package io.github.fatihbozik.ch4.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example19 {

    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4);
        s.forEach(System.out::println);

        Stream<Integer> s2 = Stream.of(1, 2, 3, 4);
        System.out.println(s2.collect(Collectors.toList()));

        Stream<Integer> s3 = Stream.of(1, 2, 3, 4);
        s3.peek(System.out::println).count();

        Stream<Integer> s4 = Stream.of(1, 2, 3, 4);
        s4.limit(2).forEach(System.out::println);
    }
}
