package io.github.fatihbozik.ch5.assertion;

public class Example1 {
    public static void main(String[] args) {
        int numGuests = -5;
        assert numGuests > 0;
        System.out.println(numGuests);
    }
}
