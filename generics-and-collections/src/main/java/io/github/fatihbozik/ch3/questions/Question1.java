package io.github.fatihbozik.ch3.questions;

class Hello<T> {
    T t;

    public Hello(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }
}

public class Question1 {
    public static void main(String[] args) {
        System.out.print(new Hello<String>("hi"));
        System.out.print(new Hello("there"));
    }
}
