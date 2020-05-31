package io.github.fatihbozik.ch7.syncronizingdataaccess.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example13 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        // Syntax #1: lock() inside try/finally
        try {
            lock.lock();
            // Implementation details
        } finally {
            lock.unlock();
        }

        // Syntax #2: lock() outside try/finally
        lock.lock();
        try {
            // Implementation details
        } finally {
            lock.unlock();
        }
    }
}
