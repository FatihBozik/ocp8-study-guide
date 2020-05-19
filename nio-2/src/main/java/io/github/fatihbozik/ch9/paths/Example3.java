package io.github.fatihbozik.ch9.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example3 {
    public static void main(String[] args) {
        printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
        System.out.println();
        printPathInformation(Paths.get("armadillo/shells.txt"));
    }

    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println("Root is: " + path.getRoot());

        Path currentParent = path;
        while ((currentParent = currentParent.getParent()) != null) {
            System.out.println(" Current parent is: " + currentParent);
        }
    }
}
