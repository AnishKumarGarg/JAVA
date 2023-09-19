import java.util.*;

public class Hashmap_practice1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(127, "Akshay");
        map.put(162, "Amit");
        map.put(192, "Anish");
        System.out.println(map);
        System.out.println(map.get(162));
        System.out.println(map.containsKey(200));
        System.out.println(map.containsKey(162));
        // map.remove(127);
        System.out.println(map);

        System.out.println("Iterating Hashmap to print keys...");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey());
        }

        System.out.println("Iterating Hashmap to print values...");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getValue());
        }

        System.out.println(map.isEmpty());

        // map.clear();
        // System.out.println(map);

        HashMap<Integer,String> clonedMap=new HashMap<>(map);
        System.out.println(clonedMap);
    }
}
