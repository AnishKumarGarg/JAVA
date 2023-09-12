 public class armstrong {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int copy = n;
        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + (lastdigit * lastdigit * lastdigit);
            n /= 10;
        }
        if (sum == copy) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Gaand maraa");
        }

    }
}
