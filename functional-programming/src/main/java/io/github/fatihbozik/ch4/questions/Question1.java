package io.github.fatihbozik.ch4.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        List<String> original = Arrays.asList("Abernaty", "Lowe", "Sizemore");
        List<String> sorted = original.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println("Original list: " + original);
        System.out.println("Sorted list: " + sorted);
    }
}
