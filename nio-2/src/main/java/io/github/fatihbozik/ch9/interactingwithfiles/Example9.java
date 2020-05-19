package io.github.fatihbozik.ch9.interactingwithfiles;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example9 {
    public static void main(String[] args) {
        Path path = Paths.get("example9.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_16)) {
            writer.write("Hello World");
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
