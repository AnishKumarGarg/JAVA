package Recursion;

public class IsSorted {
    static boolean isSorted(int arr[],int size){
        if (size==0 || size==1) {
            return true;
        }
        if(arr[size - 1] < arr[size - 2]) {
            return false;
        }
        return isSorted(arr, size-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,5,5};
        int size=arr.length;
        System.out.println(isSorted(arr, size));
    }
}
