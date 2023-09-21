// Write a Java program to check if a LinkedList is palindrome or not. 


import java.util.*;
public class LinkedList_practice4 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(6);
        ll.add(4);
        ll.add(6);
        ll.add(1);
        LinkedList<Integer> reversedll=new LinkedList<>();
        reversedll = (LinkedList) ll.clone();
        Collections.reverse(reversedll);
        // System.out.println(reversedll);

        if(ll.equals(reversedll)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Gaand maraa gya palindrome");
        }
    }
}
