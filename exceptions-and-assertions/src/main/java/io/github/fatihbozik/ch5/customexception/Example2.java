package io.github.fatihbozik.ch5.customexception;

class CannotSwimException2 extends Exception {
    public CannotSwimException2() {
        super();
    }

    public CannotSwimException2(Exception e) {
        super(e);
    }

    public CannotSwimException2(String message) {
        super(message);
    }
}
