package io.github.fatihbozik.ch5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Example5 {
    public static void main(String[] args) {
        // Creating an object with the current date
        Date d1 = new Date(); // <- Old
        LocalDate ld1 = LocalDate.now(); // <- New

        // Creating an object with the current date and time
        Date d2 = new Date(); // <- Old
        LocalDateTime dt1 = LocalDateTime.now(); // <- New

        // Creating an object representing January, 1, 2015
        // Old ---
        //        |
        //        V
        Calendar c1 = Calendar.getInstance();
        c1.set(2015, Calendar.JANUARY, 1);
        Date jan = c1.getTime();
        // or
        Calendar c2 = new GregorianCalendar(2015, Calendar.JANUARY, 1);
        Date jan2 = c2.getTime();
        // New ---
        //        |
        //        V
        LocalDate jan3 = LocalDate.of(2015, Month.JANUARY, 1);

        // Creating an object representing January, 1, 2015 without constant
        // Old ---
        //        |
        //        V
        Calendar c3 = Calendar.getInstance();
        c1.set(2015, 0, 1);
        Date jan4 = c1.getTime();
        // New ---
        //        |
        //        V
        LocalDate jan5 = LocalDate.of(2015, 1, 1);
    }
}
