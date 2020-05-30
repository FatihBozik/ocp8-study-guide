package io.github.fatihbozik.ch8.streams;

import java.io.*;
import java.net.URL;

public class Example8 {
    private static void copy(File source, File destination) throws IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(source));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        URL resource = getResource("example7_source_buffered.txt");
        File source = new File(resource.getFile());
        String destinationPath = source.getParent() + File.separator + "example7_destination_buffered.txt";
        File destination = new File(destinationPath);
        copy(source, destination);
    }

    public static URL getResource(String fileName) {
        return Example7.class.getClassLoader().getResource(fileName);
    }
}
