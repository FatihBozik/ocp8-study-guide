package io.github.fatihbozik.ch5;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Example12 {
    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1);
        System.out.println(daily); // PT24H

        daily = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(daily); // PT24H


        Duration hourly = Duration.ofHours(1);
        System.out.println(hourly); // PT1H

        hourly = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(hourly); // PT1H


        Duration everyMinute = Duration.ofMinutes(1);
        System.out.println(everyMinute); // PT1M

        everyMinute = Duration.of(1, ChronoUnit.MINUTES);
        System.out.println(everyMinute); // PT1M


        Duration everyTenSeconds = Duration.ofSeconds(10);
        System.out.println(everyTenSeconds); // PT10S

        everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
        System.out.println(everyTenSeconds); // PT10S


        Duration everyMilli = Duration.ofMillis(1);
        System.out.println(everyMilli); // PT0.001S

        everyMilli = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(everyMilli); // PT0.001S


        Duration everyNano = Duration.ofNanos(1);
        System.out.println(everyNano); // PT0.000000001S

        everyNano = Duration.of(1, ChronoUnit.NANOS);
        System.out.println(everyNano); // PT0.000000001S
    }
}
