package io.github.fatihbozik.ch4.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question4 {
    public static void main(String[] args) {
        List<String> original = Arrays.asList("Abernaty", "Lowe", "Sizemore");
        Map<Boolean, Map<String, Integer>> map =
                original.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        s -> s.length() > 5,
                                        Collectors.toMap(
                                                s -> s, String::length
                                        )
                                )
                        );
        System.out.println(map);

    }
}
