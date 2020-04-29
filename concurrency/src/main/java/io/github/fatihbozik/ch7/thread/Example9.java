package io.github.fatihbozik.ch7.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example9 {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            service.submit(() -> {
                Thread.sleep(1000);
                return null;
            });
//            service.submit(() -> Thread.sleep(1000)); // DOES NOT COMPILE
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
