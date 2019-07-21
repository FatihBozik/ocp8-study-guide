package io.github.fatihbozik.ch1.nestedclasses.innerclasses.example4;

/**
 * @author Fatih Bozik
 */
public class CaseOfPrivateInterface {
    private interface Secret {
        public void shh();
    }

    class DontTell implements Secret {
        public void shh() { }
    }
}
