package io.github.fatihbozik.ch1.nestedclasses.innerclasses.example2;


/**
 * @author Fatih Bozik
 */
public class Outer {
    private String greeting = "Hi";

    protected class Inner {
	public int repeat = 3;

	public void go() {
	    for (int i = 0; i < repeat; i++) {
		System.out.println(greeting);
	    }
	}
    }

    public static void main(String[] args) {
	Outer outer = new Outer();
	Inner inner = outer.new Inner();
	inner.go();
    }
}
