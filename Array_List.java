import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> listint = new ArrayList<>();
        ArrayList<String> liststring = new ArrayList<>();
        ArrayList<Boolean> listbool = new ArrayList<>();
        ArrayList<Float> listfloat = new ArrayList<>();

        // add elements into a list

        listint.add(352);
        listint.add(54);
        listint.add(896);

        System.out.println(listint);
        
        // get elements from the list
        System.out.println(listint.get(1));

        // add elements in bw

        listint.add(2, 45);

        System.out.println(listint);
        
        // Replace existing element in list with new element
        listint.set(3,472);
        System.out.println(listint);

        // Delete element
        listint.remove(2);
        System.out.println(listint);

        // size
        System.out.println(listint.size());

        for (int i = 0; i < listint.size(); i++) {
            System.out.print(listint.get(i)+" ");
        }
        System.out.println();

        // Sort List
        Collections.sort(listint);
        System.out.println(listint);

    }
}
