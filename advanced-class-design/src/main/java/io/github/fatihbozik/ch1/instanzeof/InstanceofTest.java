package io.github.fatihbozik.ch1.instanzeof;

interface Mother { }
class HeavyAnimal { }
class Hippo extends HeavyAnimal { }
class Elephant extends HeavyAnimal { }
class MotherHippo extends Hippo implements Mother { }

class InstanceofTest {
    public static void main(String[] args){
	HeavyAnimal hippo = new Hippo();
	boolean b1 = hippo instanceof Object;           // true
	boolean b2 = hippo instanceof HeavyAnimal;      // true
	boolean b3 = hippo instanceof Hippo;            // true
	boolean b4 = hippo instanceof Elephant;         // false

	Hippo nullHippo = null;
	boolean b5 = nullHippo instanceof Object;       // false

	// Hippo anotherHippo = new Hippo();
	// boolean b6 = anotherHippo instanceof Elephant;  // DOES NOT COMPILE
	// boolean b7 = 15 instanceof Elephant;            // DOES NOT COMPILE

	boolean b8 = hippo instanceof Mother;           // false

	hippo = new MotherHippo();
	boolean b9 = hippo instanceof MotherHippo;      // true
    }
}