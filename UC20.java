import java.util.*;

public class UC20 {

    public static void main(String[] args) {

        // Step 1: Create bogie list (try both empty and non-empty)
        String[] bogieIds = {}; // change to {"BG101","BG205","BG309"} to test normal flow

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            // Step 2: Fail-fast validation
            if (bogieIds.length == 0) {
                throw new IllegalStateException("Cannot perform search: No bogies available in train.");
            }

            // Step 3: Linear search (can reuse UC18 logic)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(key)) {
                    found = true;
                    break;
                }
            }

            // Step 4: Display result
            if (found) {
                System.out.println("Bogie ID found.");
            } else {
                System.out.println("Bogie ID not found.");
            }

        } catch (IllegalStateException e) {
            // Step 5: Handle exception
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}