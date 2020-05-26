package io.github.fatihbozik.ch3.questions;

class Helper {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }
}

public class Question2 {
    public static void main(String[] args) {
        // Helper<Throwable>.printException(new Exception("message")); // DOES NOT COMPILE
        // Helper.printException(new Throwable("message")); // DOES NOT COMPILE
        Helper.printException(new Exception("message"));
    }
}
