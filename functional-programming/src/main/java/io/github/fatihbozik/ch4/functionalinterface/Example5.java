package io.github.fatihbozik.ch4.functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Example5 {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test("")); // prints true
        System.out.println(p2.test("")); // prints true

        BiPredicate<String, String> bp1 = String::startsWith;
        BiPredicate<String, String> bp2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(bp1.test("chicken", "chick")); // prints true
        System.out.println(bp2.test("chicken", "chick")); // prints true
    }
}
