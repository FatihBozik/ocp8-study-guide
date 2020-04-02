package io.github.fatihbozik.ch4.stream;

import java.util.stream.Stream;

public class Example18 {

    public static void main(String[] args) {
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);

        Stream.generate(() -> "Olaf Lazisson")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
    }
}
