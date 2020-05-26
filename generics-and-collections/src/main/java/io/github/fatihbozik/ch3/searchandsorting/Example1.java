package io.github.fatihbozik.ch3.searchandsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Example1 {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        // Collections.sort(rabbits); DOES NOT COMPILE

        Comparator<Rabbit> byId = (r1, r2) -> r1.id - r2.id;
        Collections.sort(rabbits, byId);
    }
}
