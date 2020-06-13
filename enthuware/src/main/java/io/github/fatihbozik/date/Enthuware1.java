package io.github.fatihbozik.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Enthuware1 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2017, 12, 2, 6, 0, 0);

        ZonedDateTime nyZdt = ldt.atZone(ZoneId.of("US/Eastern"));
        System.out.println("New York Time: " + nyZdt);

        ZonedDateTime laZdt = ldt.atZone(ZoneId.of("US/Pacific"));
        System.out.println("Los Angeles Time: " + laZdt);

        Duration d = Duration.between(nyZdt, laZdt);
        System.out.println(d);
    }
}
