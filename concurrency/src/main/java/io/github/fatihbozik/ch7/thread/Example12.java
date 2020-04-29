package io.github.fatihbozik.ch7.thread;

import java.util.concurrent.*;

public class Example12 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = null;
        try {
            service = Executors.newSingleThreadScheduledExecutor();
            Runnable sayHelloCommand = () -> System.out.println("Hello");
            ScheduledFuture<?> scheduledFuture = service.scheduleAtFixedRate(sayHelloCommand, 5, 1, TimeUnit.SECONDS);
            scheduledFuture.get();
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
