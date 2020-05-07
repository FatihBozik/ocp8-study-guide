package io.github.fatihbozik.ch7.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Q15 {
    public static Integer performCount(int exhibitNumber) {
        // IMPLEMENTATION OMITTED
        return 1;
    }

    public static void printResult(Future<?> f) {
        try {
            System.out.println(f.get());
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        final List<Future<?>> results = new ArrayList<>();
        IntStream.range(0, 10).forEach(i -> results.add(service.submit(() -> performCount(i))));
        results.stream().forEach(f -> printResult(f));
        service.shutdown();
    }
}
