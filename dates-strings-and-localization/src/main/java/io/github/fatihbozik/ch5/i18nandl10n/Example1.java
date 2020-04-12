package io.github.fatihbozik.ch5.i18nandl10n;

import java.util.Locale;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());                     // en_TR
        System.out.println(Locale.GERMAN);                           // de
        System.out.println(Locale.GERMANY);                          // de_DE
        System.out.println(new Locale("fr"));               // fr
        System.out.println(new Locale("hi", "IN")); // hi_IN

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        System.out.println(l1); // en_US

        Locale.setDefault(new Locale("tr"));
        System.out.println(Locale.getDefault()); // tr
    }
}
