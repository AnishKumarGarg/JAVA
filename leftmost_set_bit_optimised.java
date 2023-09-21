import java.lang.Math;
public class leftmost_set_bit_optimised {
    public static void main(String[] args) {
        int n=20;
        int m=n-1;

        m=n^(n&m);

        System.out.println(m);

        int pos=(int)(Math.log10(m)/Math.log10(2));
        System.out.println(pos+1);
    }
}
