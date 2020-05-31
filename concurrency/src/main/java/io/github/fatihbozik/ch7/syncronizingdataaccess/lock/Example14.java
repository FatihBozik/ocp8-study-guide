package io.github.fatihbozik.ch7.syncronizingdataaccess.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example14 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.unlock(); // Throws IllegalMonitorStateException at runtime
    }
}
