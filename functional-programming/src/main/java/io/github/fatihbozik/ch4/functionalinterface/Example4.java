package io.github.fatihbozik.ch4.functionalinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example4 {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie"); // prints Annie
        c2.accept("Annie"); // prints Annie

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> bc1 = map::put;
        BiConsumer<String, Integer> bc2 = (k, v) -> map.put(k, v);

        bc1.accept("chicken", 7);
        bc1.accept("chick", 1);

        System.out.println(map); // {chicken=7, chick=1}
    }
}
