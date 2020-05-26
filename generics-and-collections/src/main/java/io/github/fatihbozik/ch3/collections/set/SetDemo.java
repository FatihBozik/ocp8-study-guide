package io.github.fatihbozik.ch3.collections.set;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        for (Integer integer : set) System.out.print(integer + ","); // 66,8,10,

        System.out.println();

        Set<Integer> set2 = new TreeSet<>();
        boolean b5 = set2.add(66); // true
        boolean b6 = set2.add(10); // true
        boolean b7 = set2.add(66); // false
        boolean b8 = set2.add(8);  // true
        for (Integer integer : set2) System.out.print(integer + ","); // 8,10,66

        System.out.println();

        NavigableSet<Integer> set3 = new TreeSet<>();
        for (int i = 1; i <= 20; i++) set3.add(i);
        System.out.println(set3.lower(10)); // 9
        System.out.println(set3.floor(10)); // 10
        System.out.println(set3.ceiling(20)); // 20
        System.out.println(set3.higher(20)); // null
    }
}
