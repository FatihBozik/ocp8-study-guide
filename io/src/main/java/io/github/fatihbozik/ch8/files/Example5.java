package io.github.fatihbozik.ch8.files;

import java.io.IOException;
import java.io.InputStream;

public class Example5 {
    public static void main(String[] args) throws IOException {
        InputStream is = Example5.class.getClassLoader().getResourceAsStream("example5.txt");
        System.out.print((char) is.read());
        if (is.markSupported()) {
            is.mark(100);
            System.out.print((char) is.read());
            System.out.print((char) is.read());
            is.reset();
        }
        System.out.print((char) is.read());
        System.out.print((char) is.read());
        System.out.print((char) is.read());
    }
}
