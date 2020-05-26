package io.github.fatihbozik.ch3.searchandsorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hoppy", "Fluffy"); // Descending order
        int index = Collections.binarySearch(names, "Hoppy", Comparator.reverseOrder()); // search descending order
        System.out.println(index); // 0
    }
}
