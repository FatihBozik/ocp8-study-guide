package io.github.fatihbozik.ch3.workingwithgenerics.example2;

public class Crate<T> {                 // public class Crate {
    private T contents;                 //     private Object contents;
                                        //
    public T emptyCrate() {             //     public Object emptyCrate() {
        return contents;                //         return contents;
    }                                   //     }
                                        //
    public void packCrate(T contents) { //     public void packCrate(Object contents) {
        this.contents = contents;       //         this.contents = contents;
    }                                   //      }
}                                       // }

class Elephant {}
class Zebra {}
class Robot {}

class Demo {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();  // Elephant inNewHome = (Elephant) crateForElephant.emptyCrate();

        Crate<Zebra> crateForZebra = new Crate<>();

        Robot joeBot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(joeBot);
        // ship to St. Louis
        Robot atDestination = robotCrate.emptyCrate(); // Robot atDestination = (Robot) robotCrate.emptyCrate();
    }
}
