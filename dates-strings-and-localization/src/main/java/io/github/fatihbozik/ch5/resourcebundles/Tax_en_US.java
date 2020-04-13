package io.github.fatihbozik.ch5.resourcebundles;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

class UsTaxCode {
    @Override
    public String toString() {
        return "UsTaxCode{}";
    }
}

public class Tax_en_US extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"tax", new UsTaxCode()}};
    }

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("io.github.fatihbozik.ch5.resourcebundles.Tax", Locale.US);
        System.out.println(rb.getObject("tax"));
    }
}
