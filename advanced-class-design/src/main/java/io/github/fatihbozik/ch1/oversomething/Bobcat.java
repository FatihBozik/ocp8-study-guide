package io.github.fatihbozik.ch1.oversomething;

/*
   Question: Which method(s) in BobcatKitten overload
   or override the one in Bobcat?
 */
public class Bobcat {
    public void findDen() {
    }
}

class BobcatKitten extends Bobcat {
    // Overriding because it has the same method signatures
    public void findDen() {
    }

    // Overloading because it has the same method name but different parameter list
    public void findDen(boolean b) {
    }

    // Not an override or overload because it has different method name
    public int findden() throws Exception {
	return 0;
    }
}