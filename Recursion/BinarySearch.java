public class BinarySearch {
    static int binarySearch(int[] arr, int start, int end, int k) {
        // Base Case
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (arr[mid]==k) {
            return mid;
        }
        else if (k>arr[mid]) {
            return binarySearch(arr, mid+1, end, k);
        }
        else{
            return binarySearch(arr, start, mid-1, k);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,9,10};
        int size = arr.length;
        int k = 3;
        int start = 0;
        int end = size - 1;
        int pos = binarySearch(arr, start, end, k);
        if (pos == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element found at index: " + pos);
        }
    }
}
