package io.github.fatihbozik.ch5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;

public class Example9 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.APRIL, 12);
        System.out.println(date.toEpochDay());

        LocalDateTime dateTime = LocalDateTime.of(2020, Month.APRIL, 12, 16, 51);
        System.out.println(dateTime.toEpochSecond(ZoneOffset.UTC));
    }
}
