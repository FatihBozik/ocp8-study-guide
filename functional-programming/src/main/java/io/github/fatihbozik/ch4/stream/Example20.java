package io.github.fatihbozik.ch4.stream;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example20 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        int reduce = stream.reduce(0, (a, b) -> a + b); // 6

        Stream<Integer> stream2 = Stream.of(1, 2, 3);
        System.out.println(stream2.mapToInt(x -> x).sum()); // 6

        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        DoubleStream empty = DoubleStream.empty();

        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);

        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        varargs.forEach(System.out::println);

        DoubleStream random = DoubleStream.generate(Math::random);
        random.limit(3).forEach(System.out::println);

        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        fractions.limit(3).forEach(System.out::println);

        Random r = new Random();
        r.ints().limit(3).forEach(System.out::println);

        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        count.forEach(System.out::println);

        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::println);

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);

        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream2 = objStream.mapToInt(s -> s.length());
    }
}
