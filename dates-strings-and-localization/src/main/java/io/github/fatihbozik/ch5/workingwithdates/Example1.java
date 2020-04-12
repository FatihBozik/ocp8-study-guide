package io.github.fatihbozik.ch5.workingwithdates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("LocalDate: " + LocalDate.now()); // LocalDate: 2020-04-12
        System.out.println("LocalTime: " + LocalTime.now()); // LocalTime: 15:13:31.748
        System.out.println("LocalDateTime: " + LocalDateTime.now()); // LocalDateTime: 2020-04-12T15:13:31.748
        System.out.println("ZonedDateTime: " + ZonedDateTime.now()); // ZonedDateTime: 2020-04-12T15:13:31.748+03:00[Europe/Istanbul]
    }
}
