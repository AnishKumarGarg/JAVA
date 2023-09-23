public class prime_factor {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 49;
        int k = 2;
        int count = 0;
        for (int i = 1; i <= 15/2; i++) {
            if (n % i == 0 && isPrime(i)) {
                count++;

                if(count == k){
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}
