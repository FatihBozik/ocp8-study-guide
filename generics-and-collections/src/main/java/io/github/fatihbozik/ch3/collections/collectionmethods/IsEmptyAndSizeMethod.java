package io.github.fatihbozik.ch3.collections.collectionmethods;

import java.util.ArrayList;
import java.util.List;

/**
 * boolean isEmpty()
 * <p>
 * int size()
 */
public class IsEmptyAndSizeMethod {

    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size()); // 0

        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2
    }
}
