// Make ith bit set / set ith bit of a number
package Bit_manipulation;

public class practice1 {
    public static void main(String[] args) {
        int n=4;   // 0100
        int m=1;   // 0001
        int i=2;   // Number of places to shift right to

        m=m<<i-1;  // Shift right m by i-1 places

        System.out.println(m|n);  // m or n
    }
}


/*
 We have a number n(4). We want to make ith(2) bit of n as 1.
 Step 1->We take a mask(m). Here we take is 1 (0001).
 Step 2->Then we shift right m by i-1 positions.  
 Step 3->Then we perform 'or' operation on n and m.
         0100  (4)
    or(+)0010  (1 when shifted by 2-1=1 position)
        =0110  (6)   
 */ 
