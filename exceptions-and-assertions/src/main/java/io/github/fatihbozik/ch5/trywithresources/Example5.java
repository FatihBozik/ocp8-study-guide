package io.github.fatihbozik.ch5.trywithresources;

class TurkeyCageEx implements AutoCloseable {
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }
}

public class Example5 {
    public static void main(String[] args) {
//        try (TurkeyCageEx t = new TurkeyCageEx()) { // DOES NOT COMPILE
//            System.out.println("put turkeys in");
//        }
    }
}
