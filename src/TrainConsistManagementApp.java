import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create bogie list (try empty and non-empty cases)
        List<String> bogieIds = new ArrayList<>();

        // Uncomment to test valid case
        // bogieIds.add("BG101");
        // bogieIds.add("BG205");
        // bogieIds.add("BG309");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            // Step 2: Check empty condition (Fail-Fast)
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException("No bogies available for search!");
            }

            // Step 3: Perform search (Linear Search)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(key)) {
                    found = true;
                    System.out.println("Bogie found: " + key);
                    break;
                }
            }

            if (!found) {
                System.out.println("Bogie not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}