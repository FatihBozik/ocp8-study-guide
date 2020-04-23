package io.github.fatihbozik.ch5.trywithresources;

import java.io.Closeable;

class AutoCloseableFlow {
    static class Door implements AutoCloseable {
        public void close() {
            System.out.print("D");
            throw new RuntimeException("door");
        }
    }

    static class Window implements Closeable {
        public void close() {
            System.out.print("W");
            throw new RuntimeException("window");
        }
    }

    public static void main(String[] args) {
        try (Door d = new Door();
             Window w = new Window()) {
            System.out.print("T");
        } catch (Exception e) {
            System.out.print("E");
        } finally {
            System.out.print("F");
        }
    }
}
