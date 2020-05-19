package io.github.fatihbozik.ch9.newstreammethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example4 {
    public static void main(String[] args) {
        Path path = Paths.get("./nio-2/src/main/java/io/github/fatihbozik/ch9/newstreammethods/Example4.java");
        try {
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
