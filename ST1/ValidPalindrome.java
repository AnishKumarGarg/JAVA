import java.util.*;
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        s=s.replaceAll("\\p{Punct}", "");
        s=s.replaceAll(" ","" );
        // System.out.println(s);
        StringBuffer sb=new StringBuffer(s);
        StringBuffer sb2=new StringBuffer(s);
        sb2=sb2.reverse();
        if (sb.toString().toLowerCase().equals(sb2.toString().toLowerCase())) {
            System.out.println("true");
        }
        else{ 
            System.out.println("false");
        }


    }
}
