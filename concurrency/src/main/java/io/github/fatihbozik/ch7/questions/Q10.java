package io.github.fatihbozik.ch7.questions;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Q10 {
    static void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException {
        deque.offer(103);
        deque.offerFirst(20, 1, TimeUnit.SECONDS);
        deque.offerLast(85, 7, TimeUnit.SECONDS);
        System.out.println(deque.pollFirst(200, TimeUnit.NANOSECONDS));
        System.out.println(" " + deque.pollLast(1, TimeUnit.MINUTES));
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        addAndPrintItems(deque);
    }
}
