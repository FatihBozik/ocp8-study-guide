package io.github.fatihbozik.ch8.files;

import java.io.File;

public class Example3 {
    public static void main(String[] args) {
        File file = new File("/Users/fatihbozik/IdeaProjects/Github/ocp8-study-guide/README.adoc");
        System.out.println("File Exists: " + file.exists());
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("File size: " + file.length());
                System.out.println("File LastModified: " + file.lastModified());
            } else {
                for (File subfile : file.listFiles()) {
                    System.out.println("\t" + subfile.getName());
                }
            }
            // boolean delete = file.delete();
            // boolean mkdir = file.mkdir();
            // boolean mkdirs = file.mkdirs();
            // boolean newFileName = file.renameTo(new File("/Users/fatihbozik/IdeaProjects/Github/ocp11-study-guide"));
        }
    }
}
