package io.github.fatihbozik.ch4.functionalinterface;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Example3 {
    public static void main(String[] args) {
        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = () -> new StringBuilder();

        System.out.println(s1.get());
        System.out.println(s2.get());

        Supplier<ArrayList<String>> s3 = ArrayList<String>::new; // ArrayList::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(a1);
    }
}
