package io.github.fatihbozik.ch3.workingwithgenerics.example6;

import java.util.ArrayList;
import java.util.List;

public class UnboundedType {

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        // printList(keywords); // DOES NOT COMPILE
    }

    public static void printList(List<Object> list) {
        for (Object x : list) {
            System.out.println(x);
        }
    }
}
