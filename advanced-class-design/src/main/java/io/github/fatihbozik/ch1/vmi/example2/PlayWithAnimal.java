package io.github.fatihbozik.ch1.vmi.example2;


/**
 * @author Fatih Bozik
 */
public class PlayWithAnimal {
    public static void main(String... args) {
	Animal animal = new Lion();
	animal.printName(); // Animal
    }
}


abstract class Animal {
    String name = "Animal";

    public void printName() {
	System.out.println(name);
    }
}

class Lion extends Animal {
    String name = "Lion";
}
