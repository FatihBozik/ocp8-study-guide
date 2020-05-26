package io.github.fatihbozik.ch3.searchandsorting;

import java.util.Set;
import java.util.TreeSet;

class Duck {
    private String name;

    public Duck(String name) {
        this.name = name;
    }
}

class UseTreeSet {
    static class Rabbit {
        int id;

        public int getId() {
            return id;
        }
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));
        Set<Rabbit> rabbit = new TreeSet<>();
        rabbit.add(new Rabbit()); // throws an exception

        Set<Rabbit> rabbit2 = new TreeSet<>((r1, r2) -> r1.id - r2.id);
        rabbit2.add(new Rabbit());
    }


}
