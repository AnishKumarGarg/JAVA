import java.util.*;

public class ArrayList_practice6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Bob");
        names.add("Alice");
        names.add("David");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        ArrayList<Object> MergedList = new ArrayList<>();
        MergedList.addAll(numbers);
        MergedList.addAll(names);
        System.out.println(MergedList);
    }
}
