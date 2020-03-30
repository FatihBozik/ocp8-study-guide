package io.github.fatihbozik.ch4.stream;

import java.util.stream.Stream;

public class Example10 {
    public static void main(String[] args) {
        String[] array = new String[]{"w", "o", "l", "f"};
        String result = "";
        for (String s : array) result = result + s;
        System.out.println(result); // wolf

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        String word2 = stream2.reduce("", String::concat);
        System.out.println(word2); // wolf
    }
}
