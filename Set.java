// Set the ith bit of a number
import java.util.*;
public class Set {
    public static void main(String[] args) {
        int n=4; 
        int i=2;
        int m=1;

        m=m<<i-1;

        int answer=m|n;

        System.out.println(answer);

        
    
        
    }
}
