package io.github.fatihbozik.ch7.thread;

import java.util.concurrent.*;

public class Example11 {
    public static void main(String[] args) {
        ScheduledExecutorService service = null;
        try {
            service = Executors.newSingleThreadScheduledExecutor();

            Runnable task1 = () -> System.out.println("Hello Zoo");
            Callable<String> task2 = () -> {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Monkey");
                return "Monkey";
            };

            ScheduledFuture<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
            ScheduledFuture<?> result2 = service.schedule(task2, 12, TimeUnit.SECONDS);
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
