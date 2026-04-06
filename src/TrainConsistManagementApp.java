<<<<<<< HEAD
import java.util.HashMap;

=======
import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

// Main class (File name MUST be TrainConsistManagementApp.java)
>>>>>>> feature/UC7
public class TrainConsistManagementApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap to store bogie and its capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogies with their capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 100);

        // Display bogie capacity mapping
        System.out.println("Bogie Capacity Details:");
        System.out.println(bogieCapacity);

        // Access capacity of a specific bogie
        System.out.println("Capacity of Sleeper bogie: " + bogieCapacity.get("Sleeper"));
=======
        // Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Sort bogies by capacity (ascending)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Bogies sorted by capacity (Ascending):");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Sort bogies by capacity (descending)
        bogieList.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nBogies sorted by capacity (Descending):");
        for (Bogie b : bogieList) {
            b.display();
        }
>>>>>>> feature/UC7
    }
}