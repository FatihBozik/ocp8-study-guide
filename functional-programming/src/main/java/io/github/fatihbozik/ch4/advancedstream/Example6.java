package io.github.fatihbozik.ch4.advancedstream;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example6 {

    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}

        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
//        Map<Integer, String> map2 = ohMy2.collect(Collectors.toMap(String::length, k -> k)); // throws java.lang.IllegalStateException: Duplicate key lions

        Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map3 = ohMy3.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println(map3); // {5=lions,bears, 6=tigers}
        System.out.println(map3.getClass()); // class java.util.HashMap

        Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map4 = ohMy4.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));
        System.out.println(map4); // {5=lions,bears, 6=tigers}
        System.out.println(map4.getClass()); // class java.util.TreeMap
    }
}
