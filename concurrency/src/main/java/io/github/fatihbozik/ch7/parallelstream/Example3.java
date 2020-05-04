package io.github.fatihbozik.ch7.parallelstream;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        WhaleDataCalculator calculator = new WhaleDataCalculator();

        // Define the data
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 4000; i++) data.add(i);

        // Process the data
        long start = System.currentTimeMillis();
        calculator.processAllDataParallel(data);
        double time = (System.currentTimeMillis() - start) / 1000.0;

        // Report results
        System.out.println("\nTasks completed in: " + time + " seconds"); // Tasks completed in: 4.218 seconds
    }
}
