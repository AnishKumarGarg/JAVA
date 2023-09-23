public class rightmost_set_bit {
    public static void main(String[] args) {
        int n=20;
          int pos=1;
        while (n>1) {
            n=n>>1;
            pos++;
        }
        System.out.println(pos);
    }
}
