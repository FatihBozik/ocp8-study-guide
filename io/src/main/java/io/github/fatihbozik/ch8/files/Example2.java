package io.github.fatihbozik.ch8.files;

import java.io.File;

public class Example2 {
    public static void main(String[] args) {
        File file = new File("/home/smith/data/zoo.txt");
        System.out.println(file.exists());

        File parent = new File("/home/smith");
        File child = new File(parent,"data/zoo.txt");
        System.out.println(child.exists());
    }
}
