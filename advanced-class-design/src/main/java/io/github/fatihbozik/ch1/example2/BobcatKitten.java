package io.github.fatihbozik.ch1.example2;

public class BobcatKitten extends Bobcat {
    // overriding because it has the same method signatures
    public void findDen() {
    }

    // overloading because it has the same method name but different parameter list
    public void findDen(boolean b) {
    }

    // not an override or overload because it has different method name
    public int findden() throws Exception {
	return 0;
    }
}