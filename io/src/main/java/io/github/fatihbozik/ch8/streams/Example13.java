package io.github.fatihbozik.ch8.streams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Lion {
    @Override
    public String toString() {
        return "Lion{}";
    }
}

public class Example13 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("zoo.log");

        out.print(5); // PrintWriter method
        out.write(String.valueOf(5)); // Writer method

        out.println(); // new line

        out.print(2.0); // PrintWriter method
        out.write(String.valueOf(2.0)); // Writer method

        out.println(); // new line

        Lion lion = new Lion();
        out.print(lion); // PrintWriter method
        out.write(lion.toString()); // Writer method

        out.println(); // new line

        boolean b = out.checkError();
        System.out.println(b);

        out.flush(); // Flushes the stream
    }
}
