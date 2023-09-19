// Write a Java program to count the frequency of each element in an array and store the results in a HashMap.

import java.util.*;

public class Hashmap_practice2 {
    public static void main(String[] args) {
        // Sample array
        int[] array = { 1, 2, 3, 2, 4, 1, 3, 2, 4, 4 };

        // Create a HashMap to store the frequency count
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in the array
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency count
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " : " + frequencyMap.get(key));
        }
    }
}
