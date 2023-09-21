// Write a Java program to find the middle element of a LinkedList.

import java.util.*;

public class LinkedList_practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        // ll.add(2);
        // ll.add(4);
        // ll.add(6);
        // ll.add(8);
        // ll.add(10);
        // ll.add(12);
        int inputNumber;
        while (true) {
            inputNumber = scanner.nextInt();
            
            if (inputNumber==-1) {
                break;
            }
            ll.add(inputNumber);
        }

        System.out.println(ll.get(ll.size() / 2));
    }
}
