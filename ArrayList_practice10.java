import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayList_practice10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("done")) {
            list.add(input);
            input = scanner.nextLine();
        }
        Collections.reverse(list);
        System.out.println(list);
        
        scanner.close();
    }
}
