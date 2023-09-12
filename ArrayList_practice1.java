import java.util.*;

public class ArrayList_practice1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        System.out.println(names);

        names.remove(2);
        System.out.println(names);

        if (names.contains("Bob")) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
