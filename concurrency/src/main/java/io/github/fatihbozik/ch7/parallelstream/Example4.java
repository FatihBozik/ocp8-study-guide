package io.github.fatihbozik.ch7.parallelstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        // not predictable: KANGAROO JACKAL LEMUR
        Arrays.asList("jackal", "kangaroo", "lemur")
                .parallelStream()
                .map(String::toUpperCase)
                .forEach(a -> System.out.print(a + " "));

        System.out.println();

        List<Integer> data = Collections.synchronizedList(new ArrayList<>());
        Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream()
                .map(i -> {
                    data.add(i);
                    return i;
                }) // AVOID STATEFUL LAMBDA EXPRESSIONS!
                .forEachOrdered(i -> System.out.print(i + " ")); // 1 2 3 4 5 6
        System.out.println();
        for (Integer e : data) {
            System.out.print(e + " "); // 1 2 4 5 3 6
        }
    }
}
