import java.util.Scanner;

public class speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Distance(d in m) and time(t in s): ");
        float d = scanner.nextInt();
        float t = scanner.nextInt();
        float s = d / t;
        System.out.println(s+"m/s");
    }
}
