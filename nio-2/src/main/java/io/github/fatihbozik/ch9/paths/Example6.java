package io.github.fatihbozik.ch9.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example6 {
    public static void main(String[] args) {
        Path path1 = Paths.get("fish.txt");
        Path path2 = Paths.get("birds.txt");
        System.out.println(path1.relativize(path2)); // ../birds.txt
        System.out.println(path2.relativize(path1)); // ../fish.txt

        System.out.println();

        Path path3 = Paths.get("/habitat");
        Path path4 = Paths.get("/sanctuary/raven");
        System.out.println(path3.relativize(path4)); // ../sanctuary/raven
        System.out.println(path4.relativize(path3)); // ../../habitat


        Path path5 = Paths.get("/a/b/");
        Path path6 = Paths.get("/a/b/c/d");
        System.out.println(path5.relativize(path6)); // c/d
        System.out.println(path6.relativize(path5)); // ../..

        Path path7 = Paths.get("/primate/chimpanzee");
        Path path8 = Paths.get("bananas.txt");
        path7.relativize(path8); // THROWS EXCEPTION AT RUNTIME

        Path path9 = Paths.get("c:\\primate\\chimpanzee");
        Path path10 = Paths.get("d:\\storage\\bananas.txt");
        path9.relativize(path10); // throws an IllegalArgumentException at runtime in a Windows-based system
    }
}
