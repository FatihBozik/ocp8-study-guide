package io.github.fatihbozik.ch5.multicatch;

import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        try {
            // do some work
        } catch (RuntimeException e) {
            e = new RuntimeException();
        }

        try {
            throw new IOException();
        } catch (IOException | RuntimeException e) {
//            e = new RuntimeException(); // DOES NOT COMPILE
        }
    }
}
