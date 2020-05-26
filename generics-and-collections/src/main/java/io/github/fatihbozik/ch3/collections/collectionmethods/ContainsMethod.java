package io.github.fatihbozik.ch3.collections.collectionmethods;

import java.util.ArrayList;
import java.util.List;

/**
 * boolean contains(Object object)
 */
public class ContainsMethod {

    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.contains("hawk")); // true
        System.out.println(birds.contains("robin")); // false
    }
}
