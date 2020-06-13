package io.github.fatihbozik.concurrency;

class TestClass implements Runnable {
    volatile int x;

    public void run() {
        x = 5;
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.x = 10;
        new Thread(tc).start(); // 1
        System.out.println(tc.x);
    }
}
