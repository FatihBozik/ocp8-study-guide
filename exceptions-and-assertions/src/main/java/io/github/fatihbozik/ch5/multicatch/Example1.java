package io.github.fatihbozik.ch5.multicatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Example1 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.print(date);
        } catch (DateTimeParseException | IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
