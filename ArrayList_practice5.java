import java.util.*;
public class ArrayList_practice5 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Charlie");
        names.add("Bob");
        names.add("Alice");
        names.add("David");

        Collections.sort(names);
        System.out.println(names);

        names.remove(0);
        names.remove(names.size()-1);
        System.out.println(names);
    }
}
