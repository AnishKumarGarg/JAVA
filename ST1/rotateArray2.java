import java.util.*;
public class rotateArray2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int K = 3;
        for (int j = 0; j < K - 1; j++) {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
