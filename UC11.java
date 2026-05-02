import java.util.Scanner;
import java.util.regex.*;

public class UC11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Step 2: Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Step 3: Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Step 4: Match input
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // Step 5: Validate using matches()
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Step 6: Display result
        if (isTrainValid) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (isCargoValid) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }

        sc.close();
    }
}