package io.github.fatihbozik.ch5.workingwithdates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example14 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        Duration duration = Duration.ofHours(6);
        System.out.println(dateTime.plus(duration)); // 2015-01-20T12:15
        System.out.println(time.plus(duration)); // 12:15
//        System.out.println(date.plus(duration)); // throws UnsupportedTemporalTypeException: Unsupported unit: Seconds

        duration = Duration.ofHours(23);
        System.out.println(dateTime.plus(duration)); // 2015-01-21T05:15
        System.out.println(time.plus(duration)); // 05:15
//        System.out.println(date.plus(duration)); // throws UnsupportedTemporalTypeException: Unsupported unit: Seconds
    }
}
