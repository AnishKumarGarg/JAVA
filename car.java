import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        String cars[] = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            cars[i] = scanner.next();
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        scanner.close();
    }
}
