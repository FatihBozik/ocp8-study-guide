package io.github.fatihbozik.ch2.functionalprogramming;

interface Functional {
    void one(Example1 e, int b);
}

public class Example1 {
    public static void main(String[] args) {
        Functional f = Example1::oneParameter;

    }

    static void noneParameter() {
    }

    void oneParameter(int a) {
    }
}
