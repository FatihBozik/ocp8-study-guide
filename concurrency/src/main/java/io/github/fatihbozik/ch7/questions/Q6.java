package io.github.fatihbozik.ch7.questions;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        Integer result = Arrays.asList("duck", "children", "flamingo", "pelican")
                .parallelStream().parallel()
                .reduce(0,
                        (c1, c2) -> c1 + c2.length(),
                        (s1, s2) -> s1 + s2
                );
        System.out.println(result);
    }
}
