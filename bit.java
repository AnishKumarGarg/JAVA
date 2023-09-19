public class bit {
    public static void main(String[] args) {
        int n=18;
        System.out.println(rightmostsetbit(n)); 

    }

    static int rightmostsetbit(int n) {
        int postition = 1;
        int i = 1; // index of every bit of n
        while ((i & n) == 0) { // Bitwise operator(&) converts n to bits and takes each bit of n and then
                               // compares it according to & operator truth table till n & 1 = 0
            i = i << 1;
            postition++;

        }
        return postition;
    }
}
