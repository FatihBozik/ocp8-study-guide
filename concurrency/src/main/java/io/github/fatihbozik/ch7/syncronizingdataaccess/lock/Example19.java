package io.github.fatihbozik.ch7.syncronizingdataaccess.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example19 {
    private static int birdCount = 0;

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            try {
                lock.lock();
                ++birdCount;
            } finally {
                lock.unlock();
            }
        } finally {
            lock.unlock();
        }

        new Thread(() -> {
            if (lock.tryLock()) {
                try {
                    System.out.println("Acquired"); // Acquired
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Unavailable");
            }
        }).start();
    }
}
