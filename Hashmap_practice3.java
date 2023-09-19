import java.util.*;
public class Hashmap_practice3 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 1, 3, 2, 4, 4 };

        // Create a HashMap to store the frequency count
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        System.out.println(frequencyMap.getOrDefault(4,0)+1);
    }
}
