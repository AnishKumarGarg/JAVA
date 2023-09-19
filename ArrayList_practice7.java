import java.util.*;

public class ArrayList_practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> even = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int input = scanner.nextInt();
            if (input%2==0) {
                even.add(input);
            }
        }
        System.out.println(even);
        scanner.close();
    }
}
