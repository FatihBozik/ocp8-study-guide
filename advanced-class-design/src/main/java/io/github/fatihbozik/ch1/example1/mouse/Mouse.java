package io.github.fatihbozik.ch1.example1.mouse;

import io.github.fatihbozik.ch1.example1.cat.BigCat;

public class Mouse {
    public static void main(String[] args) {
	BigCat cat = new BigCat();
	System.out.println(cat.name);
	// System.out.println(cat.hasFur);   // DOES NOT COMPILE
	// System.out.println(cat.hasPaws);  // DOES NOT COMPILE
	// System.out.println(cat.id); 	     // DOES NOT COMPILE
    }
}
