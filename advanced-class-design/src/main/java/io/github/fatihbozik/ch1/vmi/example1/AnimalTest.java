package io.github.fatihbozik.ch1.vmi.example1;

/**
 * Example of virtual method invocation
 *
 * @author Fatih Bozik
 */
public class AnimalTest {
    public static void main(String[] args) {
	AnimalTest animalTest = new AnimalTest();
	animalTest.feedAnimal(new Cow());  // Cow::addHay invoked
	animalTest.feedAnimal(new Bird()); // Bird::addSeed invoked
	animalTest.feedAnimal(new Lion()); // Lion::addMeat invoked
    }

    /*
     	This method doesn't need to change
     	when we add a new Animal subclass.
     */
    private void feedAnimal(Animal animal) {
	animal.feed();
    }
}

abstract class Animal {
    public abstract void feed();
}

class Cow extends Animal {
    public void feed() {
	addHay();
    }

    private void addHay() {
	System.out.println("Cow::addHay invoked");
    }
}

class Bird extends Animal {
    public void feed() {
	addSeed();
    }

    private void addSeed() {
	System.out.println("Bird::addSeed invoked");
    }
}

class Lion extends Animal {
    public void feed() {
	addMeat();
    }

    private void addMeat() {
	System.out.println("Lion::addMeat invoked");
    }
}


