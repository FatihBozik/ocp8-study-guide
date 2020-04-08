package io.github.fatihbozik.ch5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("LocalDate: " + LocalDate.now());
        System.out.println("LocalTime: " + LocalTime.now());
        System.out.println("LocalDateTime: " + LocalDateTime.now());
        System.out.println("ZonedDateTime: " + ZonedDateTime.now());
    }
}
