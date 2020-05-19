package io.github.fatihbozik.ch9.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example6 {
    public static void main(String[] args) {
        try {
            Files.move(Paths.get("/zoo"), Paths.get("/zoo-new"));
            Files.move(Paths.get("/user/addresses.txt"), Paths.get("/zoo-new/addresses.txt"));
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
