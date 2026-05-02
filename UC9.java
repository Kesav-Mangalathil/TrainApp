import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String type;

    public Bogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}

public class UC9 {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper"));
        bogies.add(new Bogie("AC Chair"));
        bogies.add(new Bogie("Sleeper"));
        bogies.add(new Bogie("First Class"));
        bogies.add(new Bogie("AC Chair"));

        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                      .collect(Collectors.groupingBy(b -> b.getType()));

        System.out.println("Grouped Bogies:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " -> " + list);
        });
    }
}