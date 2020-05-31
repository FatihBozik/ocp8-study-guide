package io.github.fatihbozik.ch7.syncronizingdataaccess.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example12 {
    private static int birdCount = 0;

    public static void main(String[] args) {
        // Implementation #1 with synchronization
        Object object = new Object();
        synchronized (object) {
            System.out.print(" " + (++birdCount));
        }

        // Implementation #2 with a Lock
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            System.out.print(" " + (++birdCount));
        } finally {
            lock.unlock();
        }
    }
}
