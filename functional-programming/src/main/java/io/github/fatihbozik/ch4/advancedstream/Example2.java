package io.github.fatihbozik.ch4.advancedstream;

import java.util.Optional;

public class Example2 {
    public static void main(String[] args) {
        threeDigit(Optional.of(100));
        threeDigit(Optional.of(1000));

    }

    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3)
                System.out.println(string);
        }
    }

    private static void threeDigit2(Optional<Integer> optional) {
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }
}
