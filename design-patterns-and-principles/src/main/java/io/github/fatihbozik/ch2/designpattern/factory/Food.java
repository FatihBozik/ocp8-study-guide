package io.github.fatihbozik.ch2.designpattern.factory;

abstract class Food {
    private final int quantity;

    Food(int quantity) {
        this.quantity = quantity;
    }

    int getQuantity() {
        return quantity;
    }

    abstract void consumed();
}


