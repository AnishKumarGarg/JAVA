public class Unset {
    public static void main(String[] args) {
        int n=5;
        int i=3;

        int m=1;

        m=~(m<<i-1);

        int answer=m&n;

        System.out.println(answer);
    }
}
