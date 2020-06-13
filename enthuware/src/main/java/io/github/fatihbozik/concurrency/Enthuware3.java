package io.github.fatihbozik.concurrency;

import java.util.Arrays;
import java.util.List;

public class Enthuware3 {

    public static void main(String[] args) {
        List<String> vals = Arrays.asList("a", "b", "c", "1", "2", "3", "A", "B", "C", "D");
        String join = vals.parallelStream().reduce("_", String::concat);
        System.out.println(join); // _a_b_c_1_2_3_A_B_C_D
    }
}
