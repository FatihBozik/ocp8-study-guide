package io.github.fatihbozik.ch8.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Example12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Animal2> animals = new ArrayList<>();
        animals.add(new Animal2("Tommy Tiger", 5, 'T'));
        animals.add(new Animal2("Peter Penguin", 8, 'P'));

        File dataFile = new File("animal.data");
        createAnimalsFile(animals, dataFile);
        System.out.println(getAnimals(dataFile));
    }

    private static void createAnimalsFile(List<Animal2> animals, File dataFile) throws IOException {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream(dataFile)
                             )
                     )
        ) {
            for (Animal2 animal2 : animals) {
                out.writeObject(animal2);
            }
        }
    }

    private static List<Animal2> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
        List<Animal2> animals = new ArrayList<>();
        try (ObjectInputStream in =
                     new ObjectInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(dataFile)
                             )
                     )
        ) {
            while (true) {
                Object object = in.readObject();
                if (object instanceof Animal2) {
                    animals.add((Animal2) object);
                }
            }
        } catch (EOFException e) {
            // File end reached
        }
        return animals;
    }
}
