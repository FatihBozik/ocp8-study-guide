package io.github.fatihbozik.ch5.trywithresources;

// ExampleOne is the best implementation.
class ExampleOne implements AutoCloseable {
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }
}

// ExampleTwo throws Exception rather than a
// more specific subclass, which is not recommended.
class ExampleTwo implements AutoCloseable {
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }
}

// ExampleThree has a side effect. It changes the state
// of a variable. Side effects are not recommended.
class ExampleThree implements AutoCloseable {
    static int COUNT = 0;

    public void close() {
        COUNT++;
    }
}
