package io.github.fatihbozik.ch4.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();
    }
}
