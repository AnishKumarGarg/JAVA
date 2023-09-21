public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 0, 1, 7 };
        
        LinearSearch(arr, 40);
    }

    static void LinearSearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println(i);
                return;
            } 
        }
        System.out.println("Not present");
    }
}
