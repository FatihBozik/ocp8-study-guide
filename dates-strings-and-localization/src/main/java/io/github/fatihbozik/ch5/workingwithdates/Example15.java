package io.github.fatihbozik.ch5.workingwithdates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Example15 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 5, 25);
        Period period = Period.ofDays(1);
        Duration duration = Duration.ofDays(1);

        System.out.println(date.plus(period)); // 2015-05-26
        System.out.println(date.plus(duration)); // throws UnsupportedTemporalTypeException: Unsupported unit: Seconds
    }
}
