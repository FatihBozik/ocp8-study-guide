package io.github.fatihbozik.ch4.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example6 {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.findAny().ifPresent(System.out::println); // monkey

        Stream<String> infinite = Stream.generate(() -> "chimp");
        infinite.findAny().ifPresent(System.out::println); // chimp

        OptionalInt first = IntStream.range(0, 20).findFirst();
        System.out.println(first.getAsInt()); // 0

        OptionalInt any = IntStream.range(0, 20).findAny();
        System.out.println(any.getAsInt()); // 0

        OptionalInt firstParallel = IntStream.range(0, 20).parallel().findFirst();
        System.out.println(firstParallel.getAsInt()); // 0

        OptionalInt anyParallel = IntStream.range(0, 20).parallel().findAny();
        System.out.println(anyParallel.getAsInt()); // arbitrary
    }
}
