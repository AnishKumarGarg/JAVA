import java.util.Arrays;
public class IntToArr {
    public static void main(String[] args) {
        int num = 12345;
        int[] arr = new int[Integer.toString(num).length()];
        int i = 0;

        while (num > 0) {
            arr[i++] = num % 10; 
            num /= 10;
        }

        // Print the array to verify the result
        System.out.println(Arrays.toString(arr));
    }
}
