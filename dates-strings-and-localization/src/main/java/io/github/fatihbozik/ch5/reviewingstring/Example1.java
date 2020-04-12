package io.github.fatihbozik.ch5.reviewingstring;

public class Example1 {
    public static void main(String[] args) {
        String s1 = "bunny";
        String s2 = "bunny";
        String s3 = new String("bunny");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true

        String s4 = "1" + 2 + 3;
        String s5 = 1 + 2 + "3";
        System.out.println(s4); // 123
        System.out.println(s5); // 33
    }
}
