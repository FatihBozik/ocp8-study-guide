package io.github.fatihbozik.ch4.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Example5 {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); // false
    }
}
