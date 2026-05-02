import java.util.*;

// Step 1: Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Step 2: Goods Bogie class
class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            // Step 3: Validation rule
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum");
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + type + " -> " + cargo);

        } catch (CargoSafetyException e) {
            // Step 4: Handle exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Step 5: Always runs
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    @Override
    public String toString() {
        return type + " (" + (cargo != null ? cargo : "No Cargo") + ")";
    }
}

// Step 6: Main Class
public class UC15 {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical"));
        bogies.add(new GoodsBogie("Rectangular"));

        // Safe assignment
        bogies.get(0).assignCargo("Petroleum");

        // Unsafe assignment (handled, not crashed)
        bogies.get(1).assignCargo("Petroleum");

        // Another safe assignment to show program continues
        bogies.get(1).assignCargo("Coal");

        // Final state
        System.out.println("Final Bogie Status:");
        bogies.forEach(System.out::println);
    }
}