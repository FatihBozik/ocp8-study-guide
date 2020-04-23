package io.github.fatihbozik.ch5.trywithresources;

class Turkey {
}

class TurkeyCage implements AutoCloseable {
    public void close() {
        System.out.println("Close gate");
    }
}

public class Example4 {
    public static void main(String[] args) {
//        try (Turkey t = new Turkey()) { // DOES NOT COMPILE Turkey cannot be converted to AutoCloseable
//            System.out.println(t);
//        }

        try (TurkeyCage t = new TurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }
}
