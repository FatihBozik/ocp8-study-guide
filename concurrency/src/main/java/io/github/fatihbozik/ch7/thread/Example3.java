package io.github.fatihbozik.ch7.thread;

/**
 * None will actually execute a task on a separate processing thread.
 * Instead, the thread that made the call will be used to execute the task,
 * causing the thread to wait until each run() method is complete before
 * moving on to the next line.
 */
public class Example3 {
    public static void main(String[] args) {
        new PrintData().run();
        new Thread(new PrintData()).run();
        new ReadInventoryThread().run();
    }
}
