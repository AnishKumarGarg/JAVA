// Write a Java program to reverse a LinkedList.

import java.util.*;
public class LinkedList_practice2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedList<Integer> ll=new LinkedList<>();
        System.out.print("Enter size: ");
        int size=scanner.nextInt();
        
        for(int i=0;i<size;i++){
            int inputNumber=scanner.nextInt();
            ll.add(inputNumber);
        }
        System.out.println(ll);
        Collections.reverse(ll);
        System.out.println(ll);
    }
}
