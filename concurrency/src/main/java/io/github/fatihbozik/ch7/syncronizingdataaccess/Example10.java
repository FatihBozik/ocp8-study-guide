package io.github.fatihbozik.ch7.syncronizingdataaccess;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
        for (Integer item : list) {
            System.out.print(item + " ");
            list.add(9);
        }
        System.out.println();
        System.out.println("Size: " + list.size());

        Set<Integer> set = new CopyOnWriteArraySet<>(Arrays.asList(4, 3, 52));
        for (Integer item : set) {
            System.out.print(item + " ");
            set.add(9);
        }
        System.out.println();
        System.out.println("Size: " + set.size());
    }
}
