package io.github.fatihbozik.ch4.stream;

import java.util.stream.Stream;

public class Example9 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1);
        // for (Integer i : s) { } // DOES NOT COMPILE
    }
}
