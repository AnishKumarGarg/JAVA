import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key=3;
        int position = Arrays.binarySearch(arr,key);
        System.out.println(key+" is present at position "+ position);

    }
}
