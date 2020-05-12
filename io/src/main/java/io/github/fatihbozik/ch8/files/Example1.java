package io.github.fatihbozik.ch8.files;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.separator")); // /
        System.out.println(File.separator);                       // /
    }
}
