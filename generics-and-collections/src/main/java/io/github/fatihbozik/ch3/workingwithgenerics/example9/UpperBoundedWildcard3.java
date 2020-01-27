package io.github.fatihbozik.ch3.workingwithgenerics.example9;

import java.util.ArrayList;
import java.util.List;

interface Flyer {
    void fly();
}

class HangGlider implements Flyer {
    public void fly() {
    }
}

class Goose implements Flyer {
    public void fly() {
    }
}

public class UpperBoundedWildcard3 {
    public static void main(String[] args) {
        List<Flyer> flyers = new ArrayList<>();
        flyers.add(new HangGlider());
        flyers.add(new Goose());
        anyFlyer(flyers);
        groupOfFlyers(flyers);

        List<Goose> gooseFlyer = new ArrayList<>();
        gooseFlyer.add(new Goose());
        groupOfFlyers(gooseFlyer);
//        anyFlyer(gooseFlyer); // DOES NOT COMPILE

    }

    public static void anyFlyer(List<Flyer> flyer) {

    }

    public static void groupOfFlyers(List<? extends Flyer> flyer) {

    }
}
