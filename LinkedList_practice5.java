// Write a Java program to merge two sorted LinkedLists into a single sorted LinkedList.

import java.util.*;

public class LinkedList_practice5 {
    public static void main(String[] args) {
        LinkedList<Integer> First_ll = new LinkedList<>();
        First_ll.add(9);
        First_ll.add(8);
        First_ll.add(7);
        First_ll.add(6);
        LinkedList<Integer> Second_ll = new LinkedList<>();
        Second_ll.add(2);
        Second_ll.add(3);
        Second_ll.add(1);
        Second_ll.add(4);
        Second_ll.add(5);

        LinkedList<Integer> merged_ll = new LinkedList<>();
        merged_ll.addAll(First_ll);
        merged_ll.addAll(Second_ll);

        // System.out.println(merged_ll);

        Collections.sort(merged_ll);
        System.out.println(merged_ll);
    }
}
