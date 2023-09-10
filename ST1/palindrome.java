import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("anish ");
        StringBuffer sb2=new StringBuffer(sb1);
        
        System.out.println(sb2.reverse());
        if (sb1.toString().toLowerCase().equals(sb2.toString().toLowerCase())) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
