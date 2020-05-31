package io.github.fatihbozik.ch7.syncronizingdataaccess.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SheepManager {
    private int sheepCount = 0;
    private final Lock lock = new ReentrantLock();

    void incrementAndReport() {
        try {
            lock.lock();
            System.out.print(" " + (++sheepCount));
        } finally {
            lock.unlock();
        }
    }
}

public class Example17 {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                service.submit(manager::incrementAndReport);
            }
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
