package io.github.fatihbozik.ch5.reviewingstring;

public class Example2 {
    public static void main(String[] args) {
        String s = "abcde ";
        System.out.println(s.trim().length());                    // 5
        System.out.println(s.charAt(4));                          // e
        System.out.println(s.indexOf('e'));                       // 4
        System.out.println(s.indexOf("de"));                      // 3
        System.out.println(s.substring(2, 4).toUpperCase());      // CD
        System.out.println(s.replace('a', '1')); // 1bcde
        System.out.println(s.contains("DE"));                     // false
        System.out.println(s.startsWith("a"));                    // true
    }
}
