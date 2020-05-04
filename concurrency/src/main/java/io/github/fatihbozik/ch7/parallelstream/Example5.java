package io.github.fatihbozik.ch7.parallelstream;

import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        System.out.print(Arrays.asList(1, 2, 3, 4, 5, 6).stream().findAny().get());

        System.out.println();

        System.out.print(Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().findAny().get());

        Arrays.asList(1, 2, 3, 4, 5, 6).stream().unordered();
        Arrays.asList(1, 2, 3, 4, 5, 6).stream().unordered().parallel();
    }
}
