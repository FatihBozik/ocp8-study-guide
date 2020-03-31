package io.github.fatihbozik.ch4.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Example15 {

    public static void main(String[] args) {
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);

        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::print); // bear-brown-

        Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
        s2.sorted(Comparator.reverseOrder()).forEach(System.out::print); // bear-brown-grizzly-brown bear-
        // s2.sorted(Comparator::reverseOrder()); // DOES NOT COMPILE

        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(e -> e.startsWith("g")).peek(System.out::println).count(); // grizzly
        System.out.println(count); // 1

    }
}
