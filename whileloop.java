import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (i < n+1) {
            System.out.print(i + " ");
            i++;
        }
        scanner.close();

    }
}
