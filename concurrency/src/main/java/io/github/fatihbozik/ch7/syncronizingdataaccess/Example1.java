package io.github.fatihbozik.ch7.syncronizingdataaccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SheepManager {
    private int sheepCount = 0;

    void incrementAndReport() {
        System.out.print((++sheepCount) + " ");
    }
}

class Example1 {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                service.submit(manager::incrementAndReport);
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
