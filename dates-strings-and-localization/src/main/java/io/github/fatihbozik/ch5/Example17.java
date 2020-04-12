package io.github.fatihbozik.ch5;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Example17 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
        System.out.println(nextDay); // 2015-05-26T15:55:00Z

        Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHour);

//        Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS); // throws UnsupportedTemporalTypeException
//        Instant nextYear = instant.plus(1, ChronoUnit.MONTHS); // throws UnsupportedTemporalTypeException
//        Instant nextYear = instant.plus(1, ChronoUnit.YEARS); // throws UnsupportedTemporalTypeException
    }
}
