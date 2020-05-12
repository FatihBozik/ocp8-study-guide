package io.github.fatihbozik.ch8.files;

import java.io.*;
import java.net.URL;

public class Example7 {
    public static void copy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        URL resource = getResource("example7_source.txt");
        File source = new File(resource.getFile());
        String destinationPath = source.getParent() + File.separator + "example7_destination.txt";
        File destination = new File(destinationPath);
        copy(source, destination);
    }

    public static URL getResource(String fileName) {
        return Example7.class.getClassLoader().getResource(fileName);
    }
}
