package io.github.fatihbozik.ch9.interactingwithfiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example5 {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("source-data.txt");
             OutputStream out = new FileOutputStream("output-data.txt")) {

            // Copy stream data to file
            Files.copy(is, Paths.get("/mammals/wolf.txt"));

            // Copy file data to stream
            Files.copy(Paths.get("/fish/clown.xsl"), out);

        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
