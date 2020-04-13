package io.github.fatihbozik.ch5.formattingnumber;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Example3 {
    public static void main(String[] args) throws ParseException {
        NumberFormat en = NumberFormat.getInstance(Locale.US);
        NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);

        String s = "40.45";
        System.out.println(en.parse(s)); // 40.45
        System.out.println(fr.parse(s)); // 40
    }
}
