package io.github.fatihbozik.ch5.trywithresources;

public class Example11 {
    public static void main(String[] args) {
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new IllegalStateException("turkeys ran off");
        } finally {
            throw new RuntimeException("and we couldn't find them");
        }
    }
}
