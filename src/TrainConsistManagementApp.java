import java.util.HashMap;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

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
    }
}