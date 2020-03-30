package io.github.fatihbozik.ch4.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Predicate<String> beginsWithLetterPredicate = s -> Character.isLetter(s.charAt(0));
        System.out.println(list.stream().anyMatch(beginsWithLetterPredicate)); // true
        System.out.println(list.stream().allMatch(beginsWithLetterPredicate)); // false
        System.out.println(list.stream().noneMatch(beginsWithLetterPredicate)); // false

        Stream<String> infinite = Stream.generate(() -> "chimp");
        System.out.println(infinite.anyMatch(beginsWithLetterPredicate)); // true
    }
}
