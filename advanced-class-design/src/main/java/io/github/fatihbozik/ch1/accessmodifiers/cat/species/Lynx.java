package io.github.fatihbozik.ch1.accessmodifiers.cat.species;

import io.github.fatihbozik.ch1.accessmodifiers.cat.BigCat;

public class Lynx extends BigCat {
    public static void main(String[] args) {
	BigCat cat = new BigCat();
	System.out.println(cat.name);
	// System.out.println(cat.hasFur);   // DOES NOT COMPILE
	// System.out.println(cat.hasPawns); // DOES NOT COMPILE
	// System.out.println(cat.id);       // DOES NOT COMPILE
    }
}
