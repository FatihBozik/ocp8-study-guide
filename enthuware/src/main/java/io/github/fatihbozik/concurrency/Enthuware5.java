package io.github.fatihbozik.concurrency;

class JerkyThread extends Thread {
    private int data = 0;
    private boolean done = false;

    public JerkyThread(int x) {
        super();
        this.data = x;
    }

    public synchronized int getData() {
        return data;
    }

    public synchronized boolean isDone() {
        return done;
    }

    public synchronized void run() {
        data += data;
        done = true;
    }

    public static void main(String[] args) throws Exception {
        JerkyThread[] jta = new JerkyThread[3];
        for (int i = 0; i < 3; i++) {
            jta[i] = new JerkyThread(i);
            jta[i].start();
        }
        for (JerkyThread jt : jta) {
            if (jt.isDone()) System.out.println(jt.getData());
        }
    }
}
