package io.github.fatihbozik.ch5;

import java.time.*;
import java.util.stream.IntStream;

public class Example16 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        doSomething();
        Instant later = Instant.now();
        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis()); // 669

        LocalDate date = LocalDate.of(2015, 5, 25);
        LocalTime time = LocalTime.of(11, 55, 0);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant();
        System.out.println(zonedDateTime); // 2015-05-25T11:55-04:00[US/Eastern]
        System.out.println(instant); // 2015-05-25T15:55:00Z

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        long epochSeconds = dateTime.toEpochSecond(ZoneOffset.UTC);
        instant = Instant.ofEpochSecond(epochSeconds);
        System.out.println(instant); // 2015-05-25T11:55:00Z
    }

    private static void doSomething() {
        IntStream.range(0, 9_999_999).mapToObj(i -> "").forEach(System.out::print);
    }
}
