package io.github.fatihbozik.ch4.stream;

import java.util.stream.Stream;

public class Example8 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.forEach(System.out::print); // monkeygorillabonobo
    }
}
