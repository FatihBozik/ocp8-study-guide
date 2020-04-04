package io.github.fatihbozik.ch4.advancedstream;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example5 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears

        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
        Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
        System.out.println(result2); // 5.333333333333333

        Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result3 = ohMy3.filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result3); // [tigers]
    }
}
