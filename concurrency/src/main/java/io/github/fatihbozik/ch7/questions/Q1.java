package io.github.fatihbozik.ch7.questions;

import java.util.concurrent.*;

public class Q1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(
                () -> System.out.println("Open Zoo"),
                0,
                1,
                TimeUnit.MINUTES
        );
        Future<?> result = service.submit(() -> System.out.println("Wake Staff"));
        System.out.println(result.get());
    }
}
