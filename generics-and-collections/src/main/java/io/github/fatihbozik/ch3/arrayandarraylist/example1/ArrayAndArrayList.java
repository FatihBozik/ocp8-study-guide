package io.github.fatihbozik.ch3.arrayandarraylist.example1;

import java.util.ArrayList;
import java.util.List;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  // empty list
        list.add("Fluffy");                     // [Fluffy]
        list.add("Webby");                      // [Fluffy, Webby]

        String[] array = new String[list.size()];
        array[0] = list.get(1);                 // [Webby]
        array[1] = list.get(0);                 // [Webby, Fluffy]
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
    }
}
