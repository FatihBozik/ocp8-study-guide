package io.github.fatihbozik.ch5.workingwithdates;

import java.time.ZoneId;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(ZoneId.systemDefault()); // Europe/Istanbul

        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("Istanbul"))
                .sorted()
                .forEach(System.out::println);
        // Asia/Istanbul
        // Europe/Istanbul
    }
}
