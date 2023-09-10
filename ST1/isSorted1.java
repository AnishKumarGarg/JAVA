// 1.	Check whether the given array is sorted or not.

import java.util.*;
public class isSorted1 {
    public static void main(String[] args) {
        
        int[] arr={1,3,2,4,6,5};
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[i+1]) {
                System.out.println("unsorted");
                flag=false;
                break;
            }
        }
        if (flag) {
            System.out.println("sorted");
        }

    }
}
