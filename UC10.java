import java.util.*;

class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + ")";
    }
}

public class UC10 {

    public static void main(String[] args) {

        // Step 1: Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 75));

        // Step 2: Stream → map → reduce
        int totalSeats =
                bogies.stream()
                      .map(b -> b.getCapacity())   // extract capacity
                      .reduce(0, Integer::sum);    // sum all

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Optional: show original list unchanged
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);
    }
}