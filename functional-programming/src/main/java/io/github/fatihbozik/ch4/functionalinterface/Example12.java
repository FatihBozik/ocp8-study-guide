package io.github.fatihbozik.ch4.functionalinterface;

import java.util.Optional;

public class Example12 {

    public static void main(String[] args) {
        Optional<Double> opt = average(90, 100);
        opt.ifPresent(System.out::println); // 95.0

        Optional<Double> opt2 = average();
        System.out.println(opt2.orElse(Double.NaN)); // NaN
        System.out.println(opt2.orElseGet(() -> Math.random())); // 0.295228248010566
        System.out.println(opt2.orElseThrow(() -> new IllegalStateException())); // throws java.lang.IllegalStateException
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }
}
