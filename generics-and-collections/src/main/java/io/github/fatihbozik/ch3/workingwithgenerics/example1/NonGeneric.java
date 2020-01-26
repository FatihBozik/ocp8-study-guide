package io.github.fatihbozik.ch3.workingwithgenerics.example1;

import java.util.ArrayList;
import java.util.List;

public class NonGeneric {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add(new StringBuilder("Webby"));
        printNames(names);

//        List<String> names2 = new ArrayList<>();
//        names2.add(new StringBuilder("Webby")); // DOES NOT COMPILE
    }

    static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i); // throws ClassCastException
            System.out.println(name);
        }
    }
}
