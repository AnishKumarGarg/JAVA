 import java.util.Scanner;

public class sumbw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Sum of numbers between a and b is: ");
        System.out.println(sum(a, b));
        scanner.close();
    }

    static int sum(int a, int b) {
        if (b > a) {
            return b + sum(a, b - 1);
        } else {
            return a;
        }
    }
}
