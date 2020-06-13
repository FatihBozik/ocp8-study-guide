package io.github.fatihbozik.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enthuware3 {
    public static void main(String[] args) {
        List<? extends String> in = Arrays.asList("a", "b");
        final List<?> objects = doIt(in);
    }

    public static <E extends CharSequence> List<? super E> doIt(List<E> nums) {
        return new ArrayList<>();
    }

}
