package io.github.fatihbozik.ch8.files;

import java.io.IOException;
import java.io.InputStream;

public class Example6 {
    public static void main(String[] args) throws IOException {
        InputStream is = Example6.class.getClassLoader().getResourceAsStream("example6.txt");
        System.out.print((char) is.read());
        is.skip(2);
        is.read();
        System.out.print((char) is.read());
        System.out.print((char) is.read());
    }
}
