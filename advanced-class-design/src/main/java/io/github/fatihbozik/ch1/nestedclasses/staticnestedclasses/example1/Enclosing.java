package io.github.fatihbozik.ch1.nestedclasses.staticnestedclasses.example1;

/**
 * @author Fatih Bozik
 */
public class Enclosing {
    static class Nested {
	private int price = 6;
    }
    public static void main(String[] args) {
	Nested nested = new Nested();
	System.out.println(nested.price);
    }
}
