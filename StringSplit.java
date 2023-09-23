import java.util.*;

public class StringSplit {
    public static void main(String[] args) {
        String str = "abcdefghijkl";
        String[] characters = str.split(""); 
        System.out.println(characters.toString());
        System.out.println(Arrays.toString(characters));

    }

}
