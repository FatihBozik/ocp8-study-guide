package io.github.fatihbozik.ch8.files;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.separator")); // /
        System.out.println(File.separator);                       // /

        System.out.print(System.getProperty("line.separator"));  // \n
        System.out.print(System.lineSeparator());                // \n
    }
}
