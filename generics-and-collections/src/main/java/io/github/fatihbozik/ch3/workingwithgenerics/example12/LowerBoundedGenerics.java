package io.github.fatihbozik.ch3.workingwithgenerics.example12;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedGenerics {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<>(strings);

        addSound(strings);
        addSound(objects);

        addSound2(strings);
        addSound2(objects);

//        addSound3(strings); // DOES NOT COMPILE
        addSound3(objects);

        addSound4(strings);
        addSound4(objects);
        System.out.println("Objects: " + objects);
        System.out.println("Strings: " + strings);
    }

    public static void addSound(List<?> list) {
//        list.add("quack from addSound"); // DOESNT COMPILE (unbounded generics are immutable)
    }

    public static void addSound2(List<? extends Object> list) {
//        list.add("quack from addSound2"); // DOESNT COMPILE (upper-bounded generics are immutable)
    }

    public static void addSound3(List<Object> list) {
        list.add("quack from addSound3");
    }

    public static void addSound4(List<? super String> list) {
        list.add("quack from addSound4");
    }
}
