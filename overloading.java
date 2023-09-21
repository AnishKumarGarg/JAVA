import java.util.Scanner;

public class overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        int a = scanner.nextInt();
        int b = scanner.nextInt(); 
        System.out.println(sum(x, y));
        System.out.println(sum(a, b));
        scanner.close();
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static float sum(float x, float y) {
        return x + y;
    }
}
