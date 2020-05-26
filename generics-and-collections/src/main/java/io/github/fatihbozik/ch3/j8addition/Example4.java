package io.github.fatihbozik.ch3.j8addition;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Example4 {
    public static void main(String[] args) {
        BiFunction<String, String, String> mapper = (v1, v2) -> null;
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Bus Tour");
        favorites.merge("Jenny", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);
        System.out.println(favorites); // {Tom=Bus Tour, Sam=Skyride}

    }
}
