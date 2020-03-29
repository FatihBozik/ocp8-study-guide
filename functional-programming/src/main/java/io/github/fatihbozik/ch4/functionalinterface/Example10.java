package io.github.fatihbozik.ch4.functionalinterface;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example10 {

    public static void main(String[] args) {
        Predicate<List<String>> predicate = x -> "".equals(x.get(0));
        Consumer<Long> consumer = (Long l) -> System.out.println(l);
        BiPredicate<String, String> biPredicate = (s1, s2) -> false;

//        Function<List<String>> ex1 = x -> x.get(0); // DOES NOT COMPILE
//        UnaryOperator<Long> ex2 = (Long l) -> 3.14; // DOES NOT COMPILE
//        Predicate<Object> ex4 = String::isEmpty; // DOES NOT COMPILE
    }
}
