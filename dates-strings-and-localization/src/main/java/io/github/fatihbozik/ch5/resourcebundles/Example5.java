package io.github.fatihbozik.ch5.resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class Example5 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("fr", "CA"));
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo2", locale);
        System.out.print(rb.getString("hello"));
        System.out.print(". ");
        System.out.print(rb.getString("name"));
        System.out.print(" ");
        System.out.print(rb.getString("open"));
        System.out.print(" ");
        System.out.print(rb.getString("visitor"));
        // Hello. Vancouver Zoo is open Canada visitor
    }
}
