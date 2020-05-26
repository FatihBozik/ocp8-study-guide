package io.github.fatihbozik.ch3.collections.collectionmethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * boolean add(E element);
 */
public class AddMethod {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list); // [Sparrow, Sparrow]

        Set<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // true
        System.out.println(set.add("Sparrow")); // false
        System.out.println(set); // [Sparrow]
    }
}
