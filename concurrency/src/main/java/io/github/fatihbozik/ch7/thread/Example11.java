package io.github.fatihbozik.ch7.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example11 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> {
            System.out.println("Monkey");
            return "Monkey";
        };

        service.schedule(task1, 10, TimeUnit.SECONDS);
        service.schedule(task2, 12, TimeUnit.SECONDS);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Gracefully shutting down..");
            service.shutdown();
        }));
    }
}
