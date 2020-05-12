package io.github.fatihbozik.ch8.streams;

import java.io.Console;

public class Example16 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered the following: " + userInput);
        }
    }
}
