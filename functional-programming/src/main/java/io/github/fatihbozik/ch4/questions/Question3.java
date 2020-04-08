package io.github.fatihbozik.ch4.questions;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question3 {

    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1);
        IntStream is = s.mapToInt(x -> x);
        DoubleStream ds = s.mapToDouble(x -> x);
//        Stream<Integer> s2 = ds.mapToInt(x -> x); // DOES NOT COMPILE
    }
}
