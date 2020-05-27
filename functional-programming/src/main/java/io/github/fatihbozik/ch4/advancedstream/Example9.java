package io.github.fatihbozik.ch4.advancedstream;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example9 {

    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(s -> s.charAt(0), Collectors.minBy(Character::compareTo))
                )
        );
        System.out.println(map); // {5=Optional[b], 6=Optional[t]}

        final Optional<Character> collect = Stream.of("lions", "tigers", "bears").map(s -> s.charAt(0)).collect(Collectors.minBy(Character::compareTo));
        System.out.println(collect);
    }
}
