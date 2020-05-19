package io.github.fatihbozik.ch9.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example4 {
    public static void main(String[] args) {
        try {
            Files.copy(Paths.get("/panda"), Paths.get("/panda-save"));
            Files.copy(Paths.get("/panda/bamboo.txt"), Paths.get("/panda-save/bamboo.txt"));
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
