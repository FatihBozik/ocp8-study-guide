package io.github.fatihbozik.ch5.workingwithdates;

import java.time.*;

public class Example18 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime); // 2016-03-13T01:30-05:00[US/Eastern]
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2016-03-13T03:30-04:00[US/Eastern]

        LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 6);
        LocalTime time1 = LocalTime.of(1, 30);
        ZonedDateTime dateTime1 = ZonedDateTime.of(date1, time1, zone);
        System.out.println(dateTime1); // 2016-11-06T01:30-04:00[US/Eastern]
        dateTime1 = dateTime1.plusHours(1);
        System.out.println(dateTime1); // 2016-11-06T01:30-05:00[US/Eastern]
        dateTime1 = dateTime1.plusHours(1);
        System.out.println(dateTime1); // 2016-11-06T02:30-05:00[US/Eastern]

        LocalDate date2 = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time2 = LocalTime.of(2, 30);
        ZonedDateTime dateTime2 = ZonedDateTime.of(date2, time2, zone);
        System.out.println(dateTime2); // There is no 2:30 am. Prints: 2016-03-13T03:30-04:00[US/Eastern]
    }
}
