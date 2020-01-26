package io.github.fatihbozik.ch3.workingwithgenerics.example5;

import java.util.ArrayList;
import java.util.List;

public class LegacyUnicorns {

    public static void main(String[] args) {
        List<Unicorn> unicorns = new ArrayList<>();
        addUnicorn(unicorns);

        Unicorn unicorn = unicorns.get(0); // throws ClassCastException
    }

    private static void addUnicorn(List unicorns) {
        unicorns.add(new Dragon());
    }
}
