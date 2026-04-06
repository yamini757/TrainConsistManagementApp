import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Sorted array of bogie IDs (IMPORTANT)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 3: Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                System.out.println("Bogie found at position: " + mid);
                found = true;
                break;
            }
            else if (result < 0) {
                high = mid - 1;   // search left half
            }
            else {
                low = mid + 1;    // search right half
            }
        }

        // Step 4: Result
        if (!found) {
            System.out.println("Bogie not found.");
        }

        sc.close();
    }
}