package io.github.fatihbozik.ch3.questions;

import java.util.TreeSet;

public class Question3 {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree);

        System.out.println(tree.ceiling("On"));
    }
}
