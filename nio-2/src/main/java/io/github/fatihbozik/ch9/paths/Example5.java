package io.github.fatihbozik.ch9.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example5 {
    public static void main(String[] args) {
        Path path = Paths.get("/mammal/carnivore/raccoon.image");
        System.out.println("Path is: " + path);

        System.out.println("Subpath from 0 to 3 is: " + path.subpath(0, 3));
        System.out.println("Subpath from 1 to 3 is: " + path.subpath(1, 3));
        System.out.println("Subpath from 1 to 2 is: " + path.subpath(1, 2));

        // System.out.println("Subpath from 0 to 4 is: " + path.subpath(0, 4)); // THROWS EXCEPTION AT RUNTIME
        // System.out.println("Subpath from 1 to 1 is: " + path.subpath(1, 1)); // THROWS EXCEPTION AT RUNTIME
    }
}
