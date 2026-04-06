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

    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

// Main class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create bogie list
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 70));

        // Step 2: Display all bogies
        System.out.println("All Bogies:");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Step 3: Calculate total seats using Stream + reduce
        int totalSeats = bogieList.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Step 4: Display total
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}