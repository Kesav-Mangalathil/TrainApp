import java.util.*;

public class UC17 {

    public static void main(String[] args) {

        // Step 1: Create array of bogie names
        String[] bogieNames = {
            "Sleeper",
            "AC Chair",
            "First Class",
            "General",
            "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 2: Use built-in sorting
        Arrays.sort(bogieNames);

        // Step 3: Display sorted result
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}