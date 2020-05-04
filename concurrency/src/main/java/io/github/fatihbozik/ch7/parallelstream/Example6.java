package io.github.fatihbozik.ch7.parallelstream;

import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {
        System.out.println( // wolf
                Arrays.asList('w', 'o', 'l', 'f')
                        .stream()
                        .reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3) // associative accumulator
        );

        System.out.println( // 3
                Arrays.asList(1, 2, 3, 4, 5, 6)
                        .parallelStream()
                        .reduce(0, (a, b) -> (a - b))// NOT AN ASSOCIATIVE ACCUMULATOR
        );

        System.out.println( // XwXoXlXf
                Arrays.asList("w", "o", "l", "f")
                        .parallelStream()
                        .reduce("X", String::concat)
        );
    }
}
