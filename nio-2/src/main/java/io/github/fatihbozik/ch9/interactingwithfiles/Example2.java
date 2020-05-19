package io.github.fatihbozik.ch9.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) {
        try {
            System.out.println(Files.isSameFile(Paths.get("/a/b"), Paths.get("/a/b"))); // true
            System.out.println(Files.isSameFile(Paths.get("/a/b"), Paths.get("/a/b/"))); // true
            System.out.println(Files.isSameFile(Paths.get("/a/b/c.txt"), Paths.get("/a/b/c.txt"))); // true

            // Let’s assume that all of the files in the following examples exist
            // within the file system and that cobra is a symbolic link to the snake file.
            System.out.println(Files.isSameFile(Paths.get("/user/home/cobra"), Paths.get("/user/home/snake"))); // true
            System.out.println(Files.isSameFile(Paths.get("/user/tree/../monkey"), Paths.get("/user/monkey"))); // true
            System.out.println(Files.isSameFile(Paths.get("/leaves/./giraffe.exe"), Paths.get("/leaves/giraffe.exe"))); // true
            System.out.println(Files.isSameFile(Paths.get("/flamingo/tail.data"), Paths.get("/cardinal/tail.data"))); // false
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
