package io.github.fatihbozik.ch5.workingwithdates;

import java.time.LocalDate;
import java.time.Month;

public class Example4 {
    public static void main(String[] args) {
        //        LocalDate d = new LocalDate(); // DOES NOT COMPILE
        LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException
    }
}
