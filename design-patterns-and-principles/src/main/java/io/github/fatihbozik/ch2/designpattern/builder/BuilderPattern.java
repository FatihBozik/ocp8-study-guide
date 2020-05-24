package io.github.fatihbozik.ch2.designpattern.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Animal {
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    public Animal(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    static class Builder {
        private String species;
        private int age;
        private List<String> favoriteFoods;

        public Builder setSpecies(String species) {
            this.species = species;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setFavoriteFoods(List<String> favoriteFoods) {
            this.favoriteFoods = favoriteFoods;
            return this;
        }

        public Animal build() {
            return new Animal(species, age, favoriteFoods);
        }

        @Override
        public String toString() {
            return String.format(
                    "Builder{species='%s', age=%d, favoriteFoods=%s}",
                    species, age, favoriteFoods
            );
        }
    }
}

class BuilderPatternDemo {
    public static void main(String[] args) {
        Animal animal = new Animal.Builder()
                .setFavoriteFoods(Arrays.asList("algae", "insects"))
                .setSpecies("flamingo").build();
        System.out.println(animal);
    }
}
