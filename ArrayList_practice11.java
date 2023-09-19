import java.util.*;
public class ArrayList_practice11 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(9);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list.get(1));

    }
}
