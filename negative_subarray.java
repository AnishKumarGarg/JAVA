public class negative_subarray {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 4, -5, 1 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
