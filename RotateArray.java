import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading input
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        
        // Cyclically rotating the array clockwise by K positions
        int[] rotatedArray = new int[N];
        for (int i = 0; i < N; i++) {
            rotatedArray[(i+K)%N] = arr[i];
        }
        
        // Printing the rotated array
        for (int i = 0; i < N; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
    }
}
