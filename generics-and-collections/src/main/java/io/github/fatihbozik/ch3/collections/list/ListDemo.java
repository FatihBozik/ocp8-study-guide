package io.github.fatihbozik.ch3.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SD"); // [SD]
        list.add(0, "NY"); // [NY,SD]
        list.set(1, "FL");  // [NY,FL]
        list.remove("NY");  // [FL]
        list.remove(0); // []

        list.add("OH"); // [OH]
        list.add("CO"); // [OH,CO]
        list.add("NJ"); // [OH,CO,NJ]
        String state = list.get(0); // OH
        int index = list.indexOf("NJ"); // 2
    }
}
