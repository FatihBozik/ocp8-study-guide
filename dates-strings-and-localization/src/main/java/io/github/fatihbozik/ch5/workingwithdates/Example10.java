package io.github.fatihbozik.ch5.workingwithdates;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Example10 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);
        performAnimalEnrichment(start, end, period);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
