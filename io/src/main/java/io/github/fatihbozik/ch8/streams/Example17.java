package io.github.fatihbozik.ch8.streams;

import java.io.Console;

public class Example17 {
    public static void main(String[] args) {
        // Console console = System.console();
        // console.writer().format(new Locale("fr", "CA"),"Hello World");

        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console not available");
        } else {
            console.writer().println("Welcome to Our Zoo!");
            console.format("Our zoo has 391 animals and employs 25 people.");
            console.writer().println();
            console.printf("The zoo spans 128.91 acres.");
        }
    }
}
