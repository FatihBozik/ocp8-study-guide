package io.github.fatihbozik.ch5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Example7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time).minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dateTime); // 2020-01-18T19:14:30

        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        //        date2.plusMinutes(1); // DOES NOT COMPILE
        date2.plusDays(10);
        System.out.println(date2); // 2020-01-20

    }
}
