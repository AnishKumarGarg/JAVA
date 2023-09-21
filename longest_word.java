import java.util.Scanner;
public class longest_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();        
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord);        
        scanner.close();
    }
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
