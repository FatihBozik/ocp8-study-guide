package io.github.fatihbozik.ch9.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example7 {
    public static void main(String[] args) {
        try {
            Files.delete(Paths.get("/vulture/feathers.txt"));
            Files.deleteIfExists(Paths.get("/pigeon"));
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
