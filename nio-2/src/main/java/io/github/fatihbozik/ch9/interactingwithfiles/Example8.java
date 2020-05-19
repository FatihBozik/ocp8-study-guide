package io.github.fatihbozik.ch9.interactingwithfiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example8 {
    public static void main(String[] args) {
        Path path = Paths.get("example8.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.US_ASCII)) {
            // Read from the stream
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
