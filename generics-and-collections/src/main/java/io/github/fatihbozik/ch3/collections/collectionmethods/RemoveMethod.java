package io.github.fatihbozik.ch3.collections.collectionmethods;

import java.util.ArrayList;
import java.util.List;

/**
 * boolean remove(Object object);
 * <p>
 * E remove(int index);
 */
public class RemoveMethod {

    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // false;
        System.out.println(birds.remove("hawk")); // true;
        System.out.println(birds); // [hawk]

        // birds.remove(100); // throws IndexOutOfBoundsException
    }
}
