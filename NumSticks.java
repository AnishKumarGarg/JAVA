import java.util.Scanner;

public class NumSticks {
    public static void main(String[] args) {
        int[] arr = { 4, 9, 1, 32, 13 };
        System.out.println(nsticks(arr.length, 13, arr));
    }

    static int nsticks(int N, int L, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == L) {
                count++;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]+arr[j]==L) {
                    count++;
                }
            }
        }
        return count;

    }
}
