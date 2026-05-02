import java.util.LinkedList;

public class UC4_MaintainOrderedConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        trainConsist.add(2, "Pantry");

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}