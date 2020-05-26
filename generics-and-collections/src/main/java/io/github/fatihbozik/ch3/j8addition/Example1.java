package io.github.fatihbozik.ch3.j8addition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list); // [Magician]

        List<Integer> nums = Arrays.asList(1, 2, 3);
        nums.replaceAll(x -> x * 2);
        System.out.println(nums); // [2, 4, 6]

        List<String> cats = Arrays.asList("Annie", "Ripley");
        cats.forEach(System.out::print); // AnnieRipley
    }
}
