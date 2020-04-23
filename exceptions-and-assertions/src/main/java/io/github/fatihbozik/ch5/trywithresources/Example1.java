package io.github.fatihbozik.ch5.trywithresources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example1 {

    public void oldApproach(Path path1, Path path2) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = Files.newBufferedReader(path1);
            out = Files.newBufferedWriter(path2);
            out.write(in.readLine());
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();

//            // Ensuring Resources Are Closed
//            try {
//                if (in != null) in.close();
//            } catch (IOException e) {}
//            try {
//                if (out != null) out.close();
//            } catch (IOException e) {}
        }
    }

    public void newApproach(Path path1, Path path2) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(path1);
             BufferedWriter out = Files.newBufferedWriter(path2)) {
            out.write(in.readLine());
        }
    }
}
