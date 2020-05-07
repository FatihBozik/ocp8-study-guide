package io.github.fatihbozik.ch7.questions;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

class CountNumbers extends RecursiveAction {
    private int start;
    private int end;

    public CountNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (start < 0) {
            return;
        } else {
            int middle = start + ((end - start) / 2);
            invokeAll(new CountNumbers(start, middle), new CountNumbers(middle, end));
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        ForkJoinTask<?> task = new CountNumbers(0, 4);
        ForkJoinPool pool = new ForkJoinPool();
        Object invoke = pool.invoke(task);
    }
}
