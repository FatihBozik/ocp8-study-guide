package io.github.fatihbozik.ch9.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        Path path = Paths.get("/fish/sharks.log");
        try {
            final List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
