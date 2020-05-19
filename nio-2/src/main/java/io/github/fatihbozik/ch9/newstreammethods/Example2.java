package io.github.fatihbozik.ch9.newstreammethods;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        Path path = Paths.get("./nio-2");
        long dateFilter = 1420070400000L;
        try {
            Stream<Path> stream = Files.find(
                    path,
                    10,
                    (p, a) -> p.toString().endsWith(".java") && a.lastModifiedTime().toMillis() > dateFilter
            );
            stream.forEach(System.out::println);
        } catch (Exception e) {
// Handle file I/O exception...
        }
    }
}
