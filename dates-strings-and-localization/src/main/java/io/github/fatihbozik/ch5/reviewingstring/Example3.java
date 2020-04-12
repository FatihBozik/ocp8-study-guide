package io.github.fatihbozik.ch5.reviewingstring;

public class Example3 {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        b.append(12345).append('-');
        System.out.println(b.length());        // 6
        System.out.println(b.indexOf("-"));    // 5
        System.out.println(b.charAt(2));       // 3

        StringBuilder b2 = b.reverse();
        System.out.println(b2.toString());     // -54321
        System.out.println(b == b2);           // true

        StringBuilder s = new StringBuilder("abcde");
        s.insert(1, '-').delete(3, 4);
        System.out.println(s);                 // a-bde
        System.out.println(s.substring(2, 4)); // bd
    }
}
