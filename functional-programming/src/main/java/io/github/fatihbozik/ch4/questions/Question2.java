package io.github.fatihbozik.ch4.questions;

import java.util.Arrays;
import java.util.List;

public class Question2 {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
//        Stream.of(l1, l2).map(x -> x + 1).flatMap(l -> l.stream()).forEach(System.out::print); // DOES NOT COMPILE

    }
}
