import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        // Insert Pantry Car at position 2
        consist.add(2, "Pantry Car");

        System.out.println("Train consist after insertion:");
        System.out.println(consist);

        // Remove first and last bogie
        consist.removeFirst();
        consist.removeLast();

        // Display final ordered train consist
        System.out.println("Final ordered train consist:");
        System.out.println(consist);
    }
}