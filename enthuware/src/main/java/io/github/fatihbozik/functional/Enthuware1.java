package io.github.fatihbozik.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}


class Test {
    public static void main(String[] args) {
        List<Item> l = Arrays.asList(
                new Item(1, "Screw"),
                new Item(2, "Nail"),
                new Item(3, "Bolt")
        );

        l.stream()
                .sorted(Comparator.comparing(Item::getName))
                .map(Item::getName)
                .forEach(System.out::print);
    }
}
