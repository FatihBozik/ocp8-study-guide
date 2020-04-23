package io.github.fatihbozik.ch5.trywithresources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example2 {
    public void newApproach(Path path1, Path path2) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(path1);
             BufferedWriter out = Files.newBufferedWriter(path2)) {
            out.write(in.readLine());
        } catch (IOException e) {
            // exception handler
        } finally {
            // finally block
        }
    }
}
