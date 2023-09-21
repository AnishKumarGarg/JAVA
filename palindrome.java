import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(palindrom(sb));
        sc.close();
    };
    
    static boolean palindrom(StringBuilder sb) {
        StringBuilder sb1 = new StringBuilder(sb);
        sb1.reverse();
        if (sb.toString().equals(sb1.toString())) {    // We converted substring to string using toString() method because in substring .equals compares the reference rather than the contents of the strings.
            return true;
        } else {
            return false;
        }
    }
}


// In String class the .equals() method compares the contents of the string rather than their references/memory location.
// In StringBuilder class the .equals() method compares the references/memory location of the string rather than their contents.
