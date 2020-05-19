package io.github.fatihbozik.ch9.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example4 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/birds/regret.txt");
        System.out.println("Path1 is Absolute? " + path1.isAbsolute());
        System.out.println("Absolute Path1: " + path1.toAbsolutePath());

        Path path2 = Paths.get("birds/condor.txt");
        System.out.println("Path2 is Absolute? " + path2.isAbsolute());
        System.out.println("Absolute Path2 " + path2.toAbsolutePath());
    }
}
