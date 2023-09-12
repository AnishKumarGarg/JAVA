import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        char[] charArray1 = str1.toCharArray();
        Arrays.sort(charArray1);

        String str2 = "silent";

        char[] charArray2 = str2.toCharArray();

        if (charArray2.equals(charArray2)) {
            System.out.println("Anagram");
        }

    }
}
