package io.github.fatihbozik.ch3.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Duck implements Comparable<Duck> {
    private final String name;
    private final int weight;

    Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }

    public int getWeight() {
        return weight;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 1));
        ducks.add(new Duck("Puddles", 3));

        Collections.sort(ducks); // sort by name
        System.out.println(ducks); // [Puddles, Quack]
    }
}
