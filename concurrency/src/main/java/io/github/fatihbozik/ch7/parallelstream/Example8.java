package io.github.fatihbozik.ch7.parallelstream;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example8 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set); // [f, w, l, o]

        System.out.println();

        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, String> map = ohMy.collect(
                Collectors.toConcurrentMap(
                        String::length,
                        k -> k,
                        (s1, s2) -> s1 + "," + s2
                )
        );
        System.out.println(map); // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap

        System.out.println();

        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, List<String>> map2 = ohMy2.collect(
                Collectors.groupingByConcurrent(String::length)
        );
        System.out.println(map2); // {5=[lions, bears], 6=[tigers]}
    }
}
