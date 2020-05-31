package io.github.fatihbozik.ch7.syncronizingdataaccess.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example20 {
    public static void main(String[] args) {
        /*
            When the boolean value is set to true, fairness is enabled and
            the longest waiting thread is guaranteed to obtain the lock
            the next time it is released.
         */
        Lock lock = new ReentrantLock(true);
    }
}
