package io.github.fatihbozik.ch7.syncronizingdataaccess.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example16 {
    private static int birdCount = 0;

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        if (lock.tryLock(10, TimeUnit.SECONDS)) {
            try {
                System.out.print(" " + (++birdCount));
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }
}
