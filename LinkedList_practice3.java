// Write a Java program to remove duplicates from a LinkedList.

import java.util.*;

public class LinkedList_practice3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(4);
        ll.add(4);
        for (int i = 0; i < ll.size(); i++) {
            for (int j = i + 1; j < ll.size(); j++) {
                if (ll.get(i) == ll.get(j)) {
                    ll.remove(ll.get(j));
                    j--;
                }
            }
        }
        System.out.println(ll);
    }
}
