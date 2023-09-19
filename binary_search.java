public class binary_search {
  static void binarySearch(int arr[], int first, int last, int key) {
    int mid = (first + last) / 2;
    while (first <= last) {
      if (arr[mid] < key) {
        /*
         If arr[mid] is less than the key, it means that the key lies somewhere to the right of the mid. So we shift first to mid+1 and update the mid according to the new first index. Now the array is shortened (from mid+1 to last). In this way the array will  keep getting shortened in each iteration till only the key remains. 
         */
        first = mid + 1;
      } else if (arr[mid] == key) {
        System.out.println("Element is found at index: " + mid); 
        break;
      } else {
        last = mid - 1;
      }
      mid = (first + last) / 2; // Update mid for the new arrsy ehich has been narrowed down to half.
    }
    if (first > last) {  // The seach space has been narrowed down to empty space and the key element is not found
      System.out.println("Element is not found!");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50 };
    int key = 50;
    int last = arr.length - 1;
    binarySearch(arr, 0, last, key);
  }
}


/*
 During each iteration of the while loop, the search space is divided in half by updating the first and last indices based on comparisons with the middle element (arr[mid]).
If the middle element is less than the key, the first index is updated to mid + 1 to continue the search in the upper half of the array.
If the middle element is greater than the key, the last index is updated to mid - 1 to continue the search in the lower half of the array.
The loop continues until first becomes greater than last, indicating that the search space has been narrowed down to an empty range. This means that the key element is not present in the array.
At this point, the condition if (first > last) is true, and the code inside the if block is executed.
In this case, the code prints "Element is not found!" to indicate that the key element is not found in the array.
 */
