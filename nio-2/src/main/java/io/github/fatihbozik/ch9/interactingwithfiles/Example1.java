package io.github.fatihbozik.ch9.interactingwithfiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {
    public static void main(String[] args) {
        Path feathers = Paths.get("/ostrich/feathers.png");
        System.out.println(Files.exists(feathers));

        Path ostrich = Paths.get("/ostrich");
        System.out.println(Files.exists(ostrich));
    }
}
