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

        // Step 1: Create list (same as UC7)
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Step 2: Display original list
        System.out.println("All Bogies:");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Step 3: Apply Stream filtering (capacity > 60)
        List<Bogie> filteredList = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 4: Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredList) {
            b.display();
        }
    }
}