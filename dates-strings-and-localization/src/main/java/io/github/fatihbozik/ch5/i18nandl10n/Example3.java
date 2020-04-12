package io.github.fatihbozik.ch5.i18nandl10n;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Example3 {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        rb.keySet().stream()
                .map(k -> k + " " + rb.getString(k))
                .forEach(System.out::println);

        Properties props = new Properties();
        rb.keySet().forEach(k -> props.put(k, rb.getString(k)));
        System.out.println(props.getProperty("notReallyAProperty"));
        System.out.println(props.getProperty("notReallyAProperty", "123"));
    }
}
