import java.util.*;

public class ArrayList_practice4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        System.out.println(numbers);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        System.out.println(sum);
 
        // for (int i = 0; i < numbers.size(); i++) {
        //     if (numbers.get(i) % 2 == 0) {
        //         numbers.remove(numbers.get(i));
        //     }
        // }
        // System.out.println(numbers);

        if (numbers.contains(15)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        ArrayList<Integer> reversedNumbers=new ArrayList<>(numbers);

        Collections.reverse(reversedNumbers);
        System.out.println(reversedNumbers);

        System.out.println(Collections.max(numbers));



    }
}
