// Implement a multithreaded program that calculates the sum of elements in an array. Divide the array equally among multiple threads, and each thread should calculate the sum of its assigned portion. The final result should be the sum of all thread results.

public class sum_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int parts = 3;

        int num_of_ele_eachParts = arr.length / parts;

        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            cnt += 1;

            if (cnt == num_of_ele_eachParts) {
                System.out.print(sum + " ");
                sum = 0;  
                cnt = 0; 
            }
        }
    }
}
