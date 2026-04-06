import java.util.*;

// Step 1: Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Step 2: Passenger Bogie Class
class PassengerBogie {
    String name;
    int capacity;

    // Constructor with validation
    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

// Step 3: Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<PassengerBogie> list = new ArrayList<>();

        try {
            // Valid bogies
            list.add(new PassengerBogie("Sleeper", 72));
            list.add(new PassengerBogie("AC Chair", 56));

            // Invalid bogie (will throw exception)
            list.add(new PassengerBogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : list) {
            b.display();
        }
    }
}