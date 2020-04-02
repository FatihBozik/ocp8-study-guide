package io.github.fatihbozik.ch4.stream;

import java.util.*;

public class Example17 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name : list) {
            if (name.length() == 4) filtered.add(name);
        }
        Collections.sort(filtered);
        Iterator<String> iter = filtered.iterator();
        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());

        List<String> list2 = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list2.stream().filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}
