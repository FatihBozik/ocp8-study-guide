package io.github.fatihbozik.ch7.parallelstream;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        // Ordered: 1 2 3 4 5 6
        Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        // Not predictable -> 4 5 6 3 1 2
        Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .parallel()
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        // Ordered: 1 2 3 4 5 6
        Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .parallel()
                .forEachOrdered(n -> System.out.print(n + " ")); // ordered -> 1 2 3 4 5 6


    }
}
