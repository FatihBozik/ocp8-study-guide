package io.github.fatihbozik.ch5.formattingnumber;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Example5 {
    public static void main(String[] args) throws ParseException {
        String amt = "$92,807.99";
        NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
        double value = (double) cf.parse(amt);
        System.out.println(value); // 92807.99
    }
}
