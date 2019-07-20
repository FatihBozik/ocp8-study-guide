package io.github.fatihbozik.ch1.overrideannotation;

/**
 * @author Fatih Bozik
 */
class BobcatMother {
    public void findDen() {

    }
}

class Bobcat extends BobcatMother {
    @Override
    public void findDen() {

    }

    // @Override
    // public void findDen(boolean b) { } // DOES NOT COMPILE
}
