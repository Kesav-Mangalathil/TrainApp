import java.util.*;

public class UC18 {

    public static void main(String[] args) {

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 3: Linear search
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                found = true;
                break; // stop immediately when found
            }
        }

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID found.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}