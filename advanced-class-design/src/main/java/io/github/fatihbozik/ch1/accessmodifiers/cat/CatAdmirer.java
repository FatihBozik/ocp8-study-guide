package io.github.fatihbozik.ch1.accessmodifiers.cat;

public class CatAdmirer {
    public static void main(String[] args) {
	BigCat cat = new BigCat();
	System.out.println(cat.name);
	System.out.println(cat.hasFur);
	System.out.println(cat.hasPaws);
	// System.out.println(cat.id); // DOES NOT COMPILE
    }
}
