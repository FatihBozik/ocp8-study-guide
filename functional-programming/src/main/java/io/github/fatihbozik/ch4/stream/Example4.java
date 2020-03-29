package io.github.fatihbozik.ch4.stream;

import java.util.stream.Stream;

public class Example4 {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // prints 3
    }
}
