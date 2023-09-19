
// Write a method that takes an ArrayList of strings as input and returns a new ArrayList containing only the strings that start with a vowel (A, E, I, O, or U) in uppercase.
import java.util.*;

public class ArrayList_practice14 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("fbwifj");
        words.add("abwifj");
        words.add("ebwifj");
        words.add("jbwifj");
        words.add("ubwifj");
        words.add("obwifj");
        System.out.println(FilterWordsWithVowels(words));
    }

    static ArrayList<String> FilterWordsWithVowels(ArrayList<String> words) {
        ArrayList<String> FilteredList = new ArrayList<>();
        for (String word : words) {
            if (word.toUpperCase().substring(0, 1).matches("[AEIOU]")) {
                FilteredList.add(word);
            }
            
        }
        return FilteredList;
    }
}
