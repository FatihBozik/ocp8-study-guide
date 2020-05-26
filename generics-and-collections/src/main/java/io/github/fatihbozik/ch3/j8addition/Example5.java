package io.github.fatihbozik.ch3.j8addition;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Example5 {
    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);
        counts.put("fatih", null);

        BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
        Integer jenny = counts.computeIfPresent("Jenny", mapper);
        Integer sam = counts.computeIfPresent("Sam", mapper);
        Integer fatih = counts.computeIfPresent("fatih", mapper);
        System.out.println(counts); // {Jenny=2}
        System.out.println(jenny); // 2
        System.out.println(sam); // null
        System.out.println(fatih); // null
    }
}
