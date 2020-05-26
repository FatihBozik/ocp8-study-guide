package io.github.fatihbozik.ch3.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Animal implements Comparable<Animal> {
    private final int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Animal a) {
        return id - a.id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public static void main(String[] args) {
        Animal a1 = new Animal(5);
        Animal a2 = new Animal(7);

        System.out.println(a1.compareTo(a2)); // -2
        System.out.println(a1.compareTo(a1)); // 0
        System.out.println(a2.compareTo(a1)); // 2

        final List<Animal> list = Arrays.asList(a1, a2);
        Collections.sort(list);
        System.out.println(list);
    }
}
