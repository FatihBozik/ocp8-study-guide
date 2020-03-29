package io.github.fatihbozik.ch4.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Example7 {
    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = s -> s.length();

        System.out.println(f1.apply("cluck")); // prints 5
        System.out.println(f2.apply("cluck")); // prints 5


        BiFunction<String, String, String> bf1 = String::concat;
        BiFunction<String, String, String> bf2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(bf1.apply("baby ", "chick")); // prints baby chick
        System.out.println(bf2.apply("baby ", "chick")); // prints baby chick
    }
}
