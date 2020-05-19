package io.github.fatihbozik.ch9.paths;

import java.io.IOException;
import java.nio.file.Paths;

public class Example9 {
    public static void main(String[] args) {
        try {
            System.out.println(Paths.get(".").toRealPath()); // /Users/fatihbozik/IdeaProjects/Github/ocp8-study-guide
            System.out.println(Paths.get("/zebra/food.source").toRealPath()); // throws java.nio.file.NoSuchFileException
            System.out.println(Paths.get(".././food.txt").toRealPath()); // java.nio.file.NoSuchFileException
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
