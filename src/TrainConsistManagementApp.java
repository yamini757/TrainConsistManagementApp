import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchId = sc.nextLine();

        // Step 3: Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchId)) {
                found = true;
                System.out.println("Bogie found at position: " + i);
                break; // stop early
            }
        }

        // Step 4: Result
        if (!found) {
            System.out.println("Bogie not found.");
        }

        sc.close();
    }
}