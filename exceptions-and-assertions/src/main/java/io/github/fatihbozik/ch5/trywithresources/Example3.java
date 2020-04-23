package io.github.fatihbozik.ch5.trywithresources;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
        } catch (Exception e) {
//            s.nextInt(); // DOES NOT COMPILE
        } finally {
//            s.nextInt(); // DOES NOT COMPILE
        }
    }
}
