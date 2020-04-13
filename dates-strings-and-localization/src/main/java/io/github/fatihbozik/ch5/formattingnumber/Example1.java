package io.github.fatihbozik.ch5.formattingnumber;

import java.text.NumberFormat;
import java.util.Locale;

public class Example1 {
    public static void main(String[] args) {
        // A general purpose formatter
        NumberFormat instance = NumberFormat.getInstance();
        NumberFormat instance2 = NumberFormat.getInstance(Locale.CANADA);

        // Same as getInstance
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        NumberFormat numberInstance2 = NumberFormat.getNumberInstance(Locale.CANADA);

        // For formatting monetary amounts
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(Locale.CANADA);

        // For formatting percentages
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        NumberFormat percentInstance2 = NumberFormat.getPercentInstance(Locale.CANADA);

        // Rounds decimal values before displaying
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        NumberFormat integerInstance2 = NumberFormat.getIntegerInstance(Locale.CANADA);
    }
}
