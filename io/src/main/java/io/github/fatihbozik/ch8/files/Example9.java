package io.github.fatihbozik.ch8.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Example9 {

    public static void main(String[] args) throws IOException {
        File source = new File("Zoo.csv");
        File destination = new File("ZooCopy.csv");
        List<String> data = readFile(source);
        for (String record : data) {
            System.out.println(record);
        }
        writeFile(data, destination);
    }

    private static void writeFile(List<String> data, File destination) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
            for (String s : data) {
                writer.write(s);
                writer.newLine();
            }
        }
    }

    private static List<String> readFile(File source) throws IOException {
        List<String> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String s;
            while ((s = reader.readLine()) != null) {
                data.add(s);
            }
        }
        return data;
    }
}
