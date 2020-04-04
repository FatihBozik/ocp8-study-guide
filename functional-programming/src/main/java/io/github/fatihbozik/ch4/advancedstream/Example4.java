package io.github.fatihbozik.ch4.advancedstream;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class Example4 {
    private static List<String> createSafe() {
        try {
            return Example4.create();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    private static List<String> create() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
//        create().stream().count(); // DOES NOT COMPILE
//        Supplier<List<String>> s = Example4::create; // DOES NOT COMPILE

        Supplier<List<String>> s = () -> {
            try {
                return Example4.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };

        Supplier<List<String>> s2 = Example4::createSafe;
    }
}
