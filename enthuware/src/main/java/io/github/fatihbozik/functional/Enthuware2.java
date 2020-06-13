package io.github.fatihbozik.functional;

import java.util.stream.IntStream;

public class Enthuware2 {
    public static void main(String[] args) {
        Object v1 = IntStream.rangeClosed(10, 15)
                .boxed()
                .filter(x -> x > 12)
                .parallel()
                .findAny();
        System.out.println(v1); // Optional containing 13, 14, or 15

        Object v2 = IntStream.rangeClosed(10, 15)
                .boxed()
                .filter(x -> x > 12)
                .sequential()
                .findAny();
        System.out.println(v2); // Optional containing 13, 14, or 15
    }
}
