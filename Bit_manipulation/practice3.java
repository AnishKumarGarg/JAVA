//Check if a number can be represented in power of 2

package Bit_manipulation;

public class practice3 {
    public static void main(String[] args) {
        int n=4;   
        int count=0;  
        while (n>0) {
            n=n&(n-1);
            count++;
        }
        if (count<2) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
