// Write a method that takes an ArrayList of strings as input and returns a new ArrayList containing only the strings that start with a vowel (A, E, I, O, or U) in uppercase.

import java.util.*;

public class ArrayList_practice13 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Orange");
        words.add("Elephant");
        words.add("Tiger");
        words.add("Umbrella");

        ArrayList<String> filteredWords = filterWordsStartingWithVowel(words);
 
        System.out.println("Filtered Words:");
        for (String word : filteredWords) {
            System.out.println(word);
        }
    }

    public static ArrayList<String> filterWordsStartingWithVowel(ArrayList<String> words) {
        ArrayList<String> filteredWords = new ArrayList<>();

        for (String word : words) {
            String firstChar = word.substring(0, 1).toUpperCase();
            if (firstChar.matches("[AEIOU]")) {
                filteredWords.add(word.toUpperCase());
            }
        }

        return filteredWords;
        
    }
}
