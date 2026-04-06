import java.util.*;
import java.util.stream.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

// Main class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create dataset
        List<Bogie> bogieList = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogieList.add(new Bogie("Sleeper", (int)(Math.random() * 100)));
        }

        // ---------------- LOOP METHOD ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogieList) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM METHOD ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- OUTPUT ----------------
        System.out.println("=== Performance Comparison ===\n");

        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());

        System.out.println("\nLoop Execution Time   : " + loopTime + " ns");
        System.out.println("Stream Execution Time : " + streamTime + " ns");

        // Step 4: Comparison conclusion
        if (loopTime < streamTime) {
            System.out.println("\nLoop is faster in this run.");
        } else if (streamTime < loopTime) {
            System.out.println("\nStream is faster in this run.");
        } else {
            System.out.println("\nBoth have similar performance.");
        }
    }
}