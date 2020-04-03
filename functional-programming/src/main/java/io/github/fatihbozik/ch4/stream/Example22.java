package io.github.fatihbozik.ch4.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Example22 {

    public static void main(String[] args) {
        IntStream ints = IntStream.of(1, 2, 3, 4, 5);
        System.out.println(range(ints));
    }

    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax() - stats.getMin();
    }
}
