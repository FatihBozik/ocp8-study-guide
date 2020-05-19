package io.github.fatihbozik.ch9.fileattributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class Example1 {
    public static void main(String[] args) {
        boolean directory = Files.isDirectory(Paths.get("/canine/coyote/fur.jpg"));
        System.out.println(directory);

        boolean regularFile = Files.isRegularFile(Paths.get("/canine/types.txt"));
        System.out.println(regularFile);

        boolean symbolicLink = Files.isSymbolicLink(Paths.get("/canine/coyote"));
        System.out.println(symbolicLink);

        try {
            System.out.println(Files.isHidden(Paths.get("/walrus.txt")));
        } catch (IOException e) {
            // Handle file I/O exception...
        }

        boolean readable = Files.isReadable(Paths.get("/seal/baby.png"));
        System.out.println(readable);

        boolean executable = Files.isExecutable(Paths.get("/seal/baby.png"));
        System.out.println(executable);

        try {
            long size = Files.size(Paths.get("/zoo/c/animals.txt"));
            System.out.println(size);
        } catch (IOException e) {
            // Handle file I/O exception...
        }

        try {
            final Path path = Paths.get("/rabbit/food.jpg");
            System.out.println(Files.getLastModifiedTime(path).toMillis());
            Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()));
            System.out.println(Files.getLastModifiedTime(path).toMillis());
        } catch (IOException e) {
            // Handle file I/O exception...
        }

        try {
            // Read owner of file
            Path path = Paths.get("/chicken/feathers.txt");
            System.out.println(Files.getOwner(path).getName());

            // Change owner of file
            UserPrincipal owner = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("jane");
            Files.setOwner(path, owner);

            // Output the updated owner information
            System.out.println(Files.getOwner(path).getName());
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
