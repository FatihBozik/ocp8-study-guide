package io.github.fatihbozik.ch4.functionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Example9 {

    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("chirp")); // prints CHIRP
        System.out.println(u2.apply("chirp")); // prints CHIRP


        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick")); // prints baby chick
        System.out.println(b2.apply("baby ", "chick")); // prints baby chick
    }
}
