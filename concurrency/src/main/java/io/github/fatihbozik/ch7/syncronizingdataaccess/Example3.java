package io.github.fatihbozik.ch7.syncronizingdataaccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Counter {
    private int count = 0;

    void incrementAndReport() {
        synchronized (this) {
            System.out.print(++count + " ");
        }
    }

    synchronized void incrementAndReport2() {
        System.out.print(++count + " ");
    }

    static void staticMethod() {
        synchronized (Counter.class) {
            System.out.println("Example");
        }
    }

    static synchronized void staticMethod2() {
        System.out.println("Example");
    }
}

public class Example3 {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            Counter sheepCounter = new Counter();
            for (int i = 0; i < 10; i++) {
                service.submit(sheepCounter::incrementAndReport); // 1 2 3 4 5 6 7 8 9 10
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
