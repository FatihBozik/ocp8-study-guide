package io.github.fatihbozik.ch4.stream;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleToIntFunction;

public class Example23 {

    public static void main(String[] args) {
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;
        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());

        double d = 1.0;
        DoubleToIntFunction f1 = x -> 1;
        f1.applyAsInt(d);
    }
}
