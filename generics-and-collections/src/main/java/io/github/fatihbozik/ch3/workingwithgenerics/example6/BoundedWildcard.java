package io.github.fatihbozik.ch3.workingwithgenerics.example6;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildcard {

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);
        printList2(keywords);
    }

    public static void printList(List<?> list) {
        for (Object x : list) {
            System.out.println(x);
        }
    }

    public static <T> void printList2(List<T> list) {
        for (T x : list) {
            System.out.println(x);
        }
    }
}
