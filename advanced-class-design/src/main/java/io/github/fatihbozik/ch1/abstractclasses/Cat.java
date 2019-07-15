package io.github.fatihbozik.ch1.abstractclasses;

abstract class Cat {
    // 1. abstract void clean(); // independently compiles
    // 2. leave it blank         // independently compiles
    // 3. void clean() {}        // independently compiles
}

class Lion extends Cat {
    void clean() {
    }
}