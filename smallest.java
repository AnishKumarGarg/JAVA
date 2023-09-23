import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int n3 = scanner.nextInt();
        minmax(n1, n2, n3);
        scanner.close();
    }

    static void minmax(double n1, double n2, double n3) {
        System.out.println("Smallest number out of the three is: ");
        System.out.println(Math.min(Math.min(n1, n2), n3));
        System.out.println("Largest number out of the three is: ");
        System.out.println(Math.max(Math.max(n1, n2), n3));
    }
}
