package io.github.fatihbozik.ch4.stream;

import java.util.stream.Stream;

public class Example14 {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(t -> t.startsWith("m")).forEach(System.out::println); // monkey

        Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
        s2.distinct().forEach(System.out::print); // duckgoose

        Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
        s3.skip(5).limit(2).forEach(System.out::print); // 67

        Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
        s4.map(String::length).forEach(System.out::print); // 676
    }
}
