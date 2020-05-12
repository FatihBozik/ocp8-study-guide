package io.github.fatihbozik.ch8.streams;

import java.io.Serializable;

public class Animal2 implements Serializable {
    private static final long serialVersionUID = 2L;
    private transient final String name;
    private transient int age = 10;
    private static char type = 'c';

    {
        this.age = 14;
    }

    public Animal2() {
        this.name = "Unknown";
        this.age = 12;
        this.type = 'Q';
    }

    public Animal2(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getType() {
        return type;
    }

    public String toString() {
        return "Animal2 [name=" + name + ", age=" + age + ", type=" + type + "]";
    }
}
