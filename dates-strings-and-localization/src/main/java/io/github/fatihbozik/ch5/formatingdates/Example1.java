package io.github.fatihbozik.ch5.formatingdates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Example1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth());     // JANUARY
        System.out.println(date.getYear());      // 2020
        System.out.println(date.getDayOfYear()); // 20

        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));          // 2020-01-20
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));          // 11:12:34
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2020-01-20T11:12:34

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        System.out.println(shortDateTime.format(date));     // 1/20/20
        System.out.println(shortDateTime.format(time));     // throws UnsupportedTemporalTypeException

        System.out.println(dateTime.format(shortDateTime)); // 1/20/20
        System.out.println(date.format(shortDateTime));     // 1/20/20
        System.out.println(time.format(shortDateTime));     // throws UnsupportedTemporalTypeException
    }
}
