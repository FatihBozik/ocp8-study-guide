package io.github.fatihbozik.ch9.fileattributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class Example3 {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("/turtles/sea.txt");

        final BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        final BasicFileAttributes data = view.readAttributes();

        final FileTime lastModifiedTime = FileTime.fromMillis(data.lastModifiedTime().toMillis() + 10_000);
        view.setTimes(lastModifiedTime, null, null);
    }
}
