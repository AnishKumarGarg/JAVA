public class leftmost_set_bit {
    public static void main(String[] args) {
        int n=20;
        int m=1;
        int pos=1;

        while ((n&m)==0) {
            m=m<<1;
            pos+=1;
        }
        System.out.println(pos);
    }
}
