package io.github.fatihbozik.ch5.customexception;

class CannotSwimException extends Exception {}
class DangerInTheWater extends RuntimeException {}
class SharkInTheWaterException extends DangerInTheWater {}

class Dolphin {
    public void swim() throws CannotSwimException {
        // logic here
    }
}
