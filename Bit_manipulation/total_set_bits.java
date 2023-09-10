// Find total number of set bits

package Bit_manipulation;

public class total_set_bits {
    public static void main(String[] args) {
        int n=10;   // 01010
        int count=0;  // m=n-1
        while (n>0) {
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }
}
