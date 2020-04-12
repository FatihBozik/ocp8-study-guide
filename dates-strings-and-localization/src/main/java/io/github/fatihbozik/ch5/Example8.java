package io.github.fatihbozik.ch5;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Example8 {
    public static void main(String[] args) {
        Date d = new Date();
        d = addDay(d);
        d = subtractDay(d);

        LocalDate d2 = LocalDate.now();
        d2 = addDay(d2);
        d2 = subtractDay(d2);
    }

    public static Date addDay(Date date) { // Old
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }

    public static LocalDate addDay(LocalDate date) { // New
        return date.plusDays(1);
    }

    public static Date subtractDay(Date date) { // Old
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }

    public static LocalDate subtractDay(LocalDate date) { // New
        return date.minusDays(1);
    }
}
