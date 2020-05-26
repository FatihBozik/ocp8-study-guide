package io.github.fatihbozik.ch3.j8addition;

import java.util.HashMap;
import java.util.Map;

public class Example7 {
    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);

        counts.computeIfPresent("Jenny", (k, v) -> null);
        counts.computeIfAbsent("Sam", k -> null);
        System.out.println(counts); // {}
    }
}
