package io.github.fatihbozik.ch7.syncronizingdataaccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class SheepCounter {
    private AtomicInteger sheepCount = new AtomicInteger(0);

    void incrementAndReport() {
        System.out.print(sheepCount.incrementAndGet() + " ");
    }
}

public class Example2 {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepCounter sheepCounter = new SheepCounter();
            for (int i = 0; i < 10; i++) {
                service.submit(sheepCounter::incrementAndReport);
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
