package io.github.fatihbozik.ch5.workingwithdates;

import java.time.LocalTime;
import java.time.Period;

public class Example11 {
    public static void main(String[] args) {
        Period annually = Period.ofYears(1); // every 1 year
        System.out.println(annually); // P1Y

        Period quarterly = Period.ofMonths(3); // every 3 months
        System.out.println(quarterly); // P3M

        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        System.out.println(everyThreeWeeks); // P21D

        Period everyOtherDay = Period.ofDays(2); // every 2 days
        System.out.println(everyOtherDay); // P2D

        Period everyYearAndWeek = Period.of(1, 0, 7); // every year and 7 days
        System.out.println(everyYearAndWeek); // P1Y7D

        Period wrong = Period.ofYears(1).ofWeeks(1);
        System.out.println(wrong); // P7D

        System.out.println(Period.ofMonths(3)); // P3M
        System.out.println(Period.of(0, 20, 47)); // P20M47D
        System.out.println(Period.ofWeeks(3)); // P21D

        LocalTime time = LocalTime.of(6, 15);
        time.plus(everyOtherDay); // throws UnsupportedTemporalTypeException
    }
}
