package io.github.fatihbozik.ch7.syncronizingdataaccess.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example18 {
    private static int birdCount = 0;

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        try {
            System.out.println("main thread started."); // main thread started.
            lock.lock();
            lock.lock();
            ++birdCount;
        } finally {
            lock.unlock();
            System.out.println("main thread released lock."); // main thread released lock.
        }

        new Thread(() -> {
            System.out.println("another thread started."); // another thread started.
            if (lock.tryLock()) {
                System.out.println("another thread acquired lock."); // does not printing
                try {
                    System.out.println("Acquired"); // does not printing
                } finally {
                    System.out.println("another thread released lock."); // does not printing
                    lock.unlock();
                }
            } else {
                System.out.println("Unavailable"); // Unavailable
            }
        }).start();
    }
}
