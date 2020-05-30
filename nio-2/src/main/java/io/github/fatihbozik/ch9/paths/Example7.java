package io.github.fatihbozik.ch9.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example7 {
    public static void main(String[] args) {
        final Path path1 = Paths.get("/cats/../panther");
        final Path path2 = Paths.get("food");
        System.out.println(path1.resolve(path2));

        final Path path3 = Paths.get("/turkey/food");
        final Path path4 = Paths.get("/tiger/cage");
        System.out.println(path3.resolve(path4));

        System.out.println(path3.resolve("/directory"));
    }
}
