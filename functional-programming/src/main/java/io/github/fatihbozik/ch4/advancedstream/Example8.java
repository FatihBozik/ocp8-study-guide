package io.github.fatihbozik.ch4.advancedstream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example8 {

    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map); // {false=[tigers], true=[lions, bears]}

        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map2 = ohMy2.collect(Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map2); // {false=[], true=[lions, tigers, bears]}

        Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map3 = ohMy3.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
        System.out.println(map3); // {false=[], true=[lions, tigers, bears]}

        Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map4 = ohMy4.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map4); // {5=2, 6=1}
    }
}
