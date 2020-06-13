package io.github.fatihbozik.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.SECONDS;

class BeeperControl {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public void beepForAnHour() {
        final ScheduledFuture<?> beeperHandle = scheduler.scheduleAtFixedRate(
                () -> System.out.println("beep"), 10, 10, SECONDS
        );
        scheduler.schedule(
                () -> beeperHandle.cancel(true), 60 * 60, SECONDS
        );
    }
}

public class Enthuware1 {
    private static final String id = "enthuware.ocpjp.v8.2.1256";

    public static void main(String[] args) {
        System.out.println("Question id: " + id);
        new BeeperControl().beepForAnHour();
    }
}
