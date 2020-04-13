package io.github.fatihbozik.ch5.formattingnumber;

import java.text.NumberFormat;
import java.util.Locale;

public class Example2 {
    public static void main(String[] args) {
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth)); // 266,666

        NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(g.format(attendeesPerMonth));  // 266.666

        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth)); // 266 666

        double price = 48;
        NumberFormat us2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(us2.format(price)); // $48.00
    }
}
