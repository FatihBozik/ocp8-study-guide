package io.github.fatihbozik.ch7.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example10 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();

            // Add tasks to the thread executors
            // ...
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }

        if (service != null) {
            service.awaitTermination(1, TimeUnit.MINUTES);
            // Check whether all tasks are finished
            if (service.isTerminated()) {
                System.out.println("All tasks finished");
            } else {
                System.out.println("At least one task is still running");
            }
        }
    }
}
