import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalarr {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6,},{7,8,9},{10,11,12}};
        // int arr[][] = new int[5][3];
        // Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // arr[i][j] = scanner.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
                System.out.print(Arrays.toString(arr[i]));
                System.out.println();
        }
    

        // for (int[] is : arr) {
        //     System.out.println(Arrays.toString(is));
        // }
        // scanner.close();
    }
}
