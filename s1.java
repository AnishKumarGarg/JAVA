import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double d = scanner.nextDouble();
        System.out.println("Hello " + name);
        System.out.println("Your number is " + d);
        scanner.close();
    }
}
