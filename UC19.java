import java.util.*;

public class UC19 {

    public static void main(String[] args) {

        // Step 1: Create (possibly unsorted) bogie IDs
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort before binary search (mandatory)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Step 3: Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 4: Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp > 0) {
                low = mid + 1;   // search right half
            } else {
                high = mid - 1;  // search left half
            }
        }

        // Step 5: Output result
        if (found) {
            System.out.println("Bogie ID found.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}