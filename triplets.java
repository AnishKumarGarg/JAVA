public class triplets {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        findtriplets(arr);
    }

    static void findtriplets(int[] arr) {
        int sum;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum=arr[i]+arr[j];
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k]==sum) {
                        count++;
                    }
                }
            }
            
        }
        System.out.println(count);
    }
}
