// Write a Java program to split a LinkedList into two halves.

import java.util.*;
public class LinkedList_practice6 {
    public static void main(String[] args) {
         LinkedList<Integer> ll=new LinkedList<>();
         ll.add(1);        
         ll.add(2);        
         ll.add(3);        
         ll.add(4);        
         ll.add(5);        
         ll.add(6);    
         
         LinkedList<Integer> first_half=new LinkedList<>();
         LinkedList<Integer> second_half=new LinkedList<>();

         for(int i=0;i<ll.size()/2;i++){
            first_half.add(ll.get(i));
         }
         for (int i = ll.size()/2; i < ll.size(); i++) {
            second_half.add(ll.get(i));
         }
         System.out.println(first_half);
         System.out.println(second_half);
    }
}
