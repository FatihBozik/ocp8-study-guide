package io.github.fatihbozik.ch4.stream;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example13 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word); // wolf

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set2 = stream2.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set2); // [f, l, o, w]

        Stream<String> stream3 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set3 = stream3.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set3); // [f, l, o, w]

        Stream<String> stream4 = Stream.of("w", "o", "l", "f");
        Set<String> set4 = stream4.collect(Collectors.toSet());
        System.out.println(set4); // [f, w, l, o]
    }
}
