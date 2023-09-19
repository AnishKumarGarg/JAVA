import java.util.*;

public class binarySearch_practice {
    static void binarySearch(int[] arr, int key) {
        int first = 0;
        int last = arr.length;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println(key + " is present at index " + mid);
                break;
            } else {
                last = mid - 1;
            }

            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element not found");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to find: ");
        int key = sc.nextInt();
        binarySearch(arr, key);

        sc.close();
    }
}
