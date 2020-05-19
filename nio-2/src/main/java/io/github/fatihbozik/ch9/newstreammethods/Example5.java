package io.github.fatihbozik.ch9.newstreammethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        Path path = Paths.get("/fish/sharks.log");
        try {
            final List<String> warnLogs =
                    Files.lines(path)
                            .filter(s -> s.startsWith("WARN "))
                            .map(s -> s.substring(5))
                            .collect(Collectors.toList());
            System.out.println(warnLogs);
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
