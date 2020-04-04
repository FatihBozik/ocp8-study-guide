package io.github.fatihbozik.ch4.advancedstream;

import java.util.Optional;

public class Example3 {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Animal");
        Optional<Integer> integer = optional.map(String::length);
        integer.ifPresent(System.out::println);

//      Optional<Integer> result = optional.map(Example3::calculator); // DOES NOT COMPILE
        Optional<Integer> result2 = optional.flatMap(Example3::calculator);
    }

    private static Optional<Integer> calculator(String s) {
        return Optional.of(5);
    }
}
