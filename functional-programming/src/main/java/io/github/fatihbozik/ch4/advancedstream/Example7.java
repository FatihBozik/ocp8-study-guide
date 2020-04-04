package io.github.fatihbozik.ch4.advancedstream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example7 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}

        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map2 = ohMy2.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map2); // {5=[lions, bears], 6=[tigers]}

        Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map3 = ohMy3.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(map3); // {5=[lions, bears], 6=[tigers]}

        Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map4 = ohMy4.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(map4); // {5=[lions, bears], 6=[tigers]}
    }
}
