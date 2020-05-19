package io.github.fatihbozik.ch9.paths;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {
    public static void main(String[] args) throws URISyntaxException {
        Path path1 = Paths.get("pandas/cuddly.png");
        Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");
        Path path4 = Paths.get("/home/zoodirector");

        Path path5 = Paths.get("pandas", "cuddly.png");
        Path path6 = Paths.get("c:", "zooinfo", "November", "employees.txt");
        Path path7 = Paths.get("/", "home", "zoodirector");

        // Path path8 = Paths.get(new URI("file://pandas/cuddly.png")); // throws exception at runtime not absolute path
        Path path9 = Paths.get(new URI("file:///c:/zoo-info/November/employees.txt"));
        Path path10 = Paths.get(new URI("file:///home/zoodirectory"));

        Path path11 = Paths.get(new URI("http://www.wiley.com"));
        Path path12 = Paths.get(new URI("ftp://username:password@ftp.the-ftp-server.com"));

        URI uri11 = path11.toUri();

        Path path13 = FileSystems.getDefault().getPath("pandas/cuddly.png");
        Path path14 = FileSystems.getDefault().getPath("c:", "zooinfo", "November", "employees.txt");
        Path path15 = FileSystems.getDefault().getPath("/home/zoodirector");

        FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
        Path path16 = fileSystem.getPath("duck.txt");
    }
}
