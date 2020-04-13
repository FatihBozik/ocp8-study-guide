package io.github.fatihbozik.ch5.formattingnumber;

import java.text.NumberFormat;
import java.text.ParseException;

public class Example4 {
    public static void main(String[] args) throws ParseException {
        NumberFormat nf = NumberFormat.getInstance();
        String one = "456abc";
        String two = "-2.5165x10";
        String three = "x85.3";
        System.out.println(nf.parse(one));   // 456
        System.out.println(nf.parse(two));   // -2.5165
        System.out.println(nf.parse(three)); // throws java.text.ParseException
    }
}
