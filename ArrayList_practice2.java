import java.util.*;
public class ArrayList_practice2{
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));

        System.out.println(numbers);
        numbers.set(2, 45);
        System.out.println(numbers);

        if (numbers.isEmpty()) {
            System.out.println("Empty");
        }
        else{
            System.out.println("Not empty");
        }

        numbers.clear();
        System.out.println(numbers.size());
    }
}
