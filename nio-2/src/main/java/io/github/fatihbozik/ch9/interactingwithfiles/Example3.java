package io.github.fatihbozik.ch9.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example3 {
    public static void main(String[] args) {
        try {
            Files.createDirectory(Paths.get("/bison/field"));
            Files.createDirectories(Paths.get("/bison/field/pasture/green"));
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
