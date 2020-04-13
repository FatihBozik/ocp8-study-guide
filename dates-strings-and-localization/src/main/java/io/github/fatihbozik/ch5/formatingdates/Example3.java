package io.github.fatihbozik.ch5.formatingdates;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Example3 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2020, Calendar.JANUARY, 3, 11, 36);
        Date jan3 = calendar.getTime();
        SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
        System.out.println(sf.format(jan3));    // 11:36

        LocalDateTime dateTime = LocalDateTime.of(2020, Month.JANUARY, 3, 11, 36);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dateTime.format(f)); // 11:36
    }
}
