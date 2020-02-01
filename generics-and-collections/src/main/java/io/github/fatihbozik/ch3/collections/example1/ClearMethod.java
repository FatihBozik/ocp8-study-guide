package io.github.fatihbozik.ch3.collections.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * void clear()
 */
public class ClearMethod {

    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2
        birds.clear();
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size()); // 0
    }
}
