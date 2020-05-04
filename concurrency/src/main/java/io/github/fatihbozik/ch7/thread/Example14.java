package io.github.fatihbozik.ch7.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example14 {
    public static void main(String[] args) {
        ExecutorService singleThreadedService = null;
        try {
            singleThreadedService = Executors.newSingleThreadExecutor();
            singleThreadedService.submit(() -> System.out.println("Single Thread"));
        } finally {
            if (singleThreadedService != null) {
                singleThreadedService.shutdown();
            }
        }

        ExecutorService cachedThreadPoolService = null;
        try {
            cachedThreadPoolService = Executors.newCachedThreadPool();
            cachedThreadPoolService.submit(() -> System.out.println("Cached Thread Pool"));
        } finally {
            if (cachedThreadPoolService != null) {
                cachedThreadPoolService.shutdown();
            }
        }

        ExecutorService fixedThreadPoolService = null;
        try {
            fixedThreadPoolService = Executors.newFixedThreadPool(10);
            fixedThreadPoolService.submit(() -> System.out.println("Fixed Thread Pool: 10"));
        } finally {
            if (fixedThreadPoolService != null) {
                fixedThreadPoolService.shutdown();
            }
        }

        ScheduledExecutorService singleThreadedScheduledService = Executors.newSingleThreadScheduledExecutor();
        singleThreadedScheduledService.scheduleWithFixedDelay(() -> System.out.println("Single Thread Scheduled"), 0, 1, TimeUnit.SECONDS);

        ScheduledExecutorService fixedThreadPoolScheduledService = Executors.newScheduledThreadPool(10);
        fixedThreadPoolScheduledService.scheduleAtFixedRate(
                () -> System.out.println("Fixed Thread Pool Scheduled: 10"),
                3,
                1,
                TimeUnit.SECONDS
        );

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Gracefully shutting down..");
            singleThreadedScheduledService.shutdown();
            fixedThreadPoolScheduledService.shutdown();
        }));
    }
}
