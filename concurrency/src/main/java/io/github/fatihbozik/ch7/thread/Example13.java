package io.github.fatihbozik.ch7.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example13 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable sayHelloCommand = () -> System.out.println("Hello");
        service.scheduleWithFixedDelay(sayHelloCommand, 0, 2, TimeUnit.SECONDS);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Gracefully shutting down..");
            service.shutdown();
        }));
    }
}
