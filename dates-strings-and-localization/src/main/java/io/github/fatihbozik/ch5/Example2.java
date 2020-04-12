package io.github.fatihbozik.ch5;

import java.time.*;

public class Example2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date1); // 2015-01-20
        System.out.println(date2); // 2015-01-20

        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);
        System.out.println(time1); // 06:15
        System.out.println(time2); // 06:15:30
        System.out.println(time3); // 06:15:30.000000200

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1); // 2015-01-20T06:15:30
        System.out.println(dateTime2); // 2015-01-20T06:15

        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
        ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
        ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);
        System.out.println(zoned1); // 2015-01-20T06:15:30.000000200-05:00[US/Eastern]
        System.out.println(zoned2); // 2015-01-20T06:15-05:00[US/Eastern]
        System.out.println(zoned3); // 2015-01-20T06:15:30-05:00[US/Eastern]
    }
}
