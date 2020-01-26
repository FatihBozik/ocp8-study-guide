package io.github.fatihbozik.ch3.reviewingocacollections.example5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DiamondOperator {
    public static void main(String[] args) {
        // Before Java 5
        List names = new ArrayList();

        // In Java 5
        List<String> names2 = new ArrayList<String>();
        HashMap<String, HashMap<String, String>> map1 = new HashMap<String, HashMap<String, String>>();

        // In Java 7
        List<String> names3 = new ArrayList<>();
        HashMap<String, HashMap<String, String>> map2 = new HashMap<>();
    }
}
