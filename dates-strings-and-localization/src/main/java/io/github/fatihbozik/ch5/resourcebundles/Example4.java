package io.github.fatihbozik.ch5.resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class Example4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", new Locale("fr", "FR"));
        //  |  1.  Zoo_fr_FR.java
        //  |  2.  Zoo_fr_FR.properties
        //  |  3.  Zoo_fr.java
        //  |  4.  Zoo_fr.properties
        //  |  5.  Zoo_en_US.java
        //  |  6.  Zoo_en_US.properties
        //  |  7.  Zoo_en.java
        //  |  8.  Zoo_en.properties
        //  |  9.  Zoo.java
        //  |  10. Zoo.properties
        //  V  11. throws MissingResourceException

        Locale.setDefault(new Locale("hi"));
        ResourceBundle rb2 = ResourceBundle.getBundle("Zoo", new Locale("en"));
        //  |  1.  Zoo_en.java
        //  |  2.  Zoo_en.properties
        //  |  3.  Zoo_hi.java
        //  |  4.  Zoo_hi.properties
        //  |  5.  Zoo.java
        //  |  6.  Zoo.properties
        //  V  7.  throws MissingResourceException
    }
}
