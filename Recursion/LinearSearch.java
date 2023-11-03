public class LinearSearch {
    static int linearSearch(int[] arr,int size,int k){
        // Base Case
        if(size==0){
            return -1;
        }
        if (arr[size-1]==k) {
            return size-1;
        }

       // Recursive Case
       int pos=linearSearch(arr, size-1, k);
       return pos;
    }
    public static void main(String[] args) {
        int[] arr={3,5,1,2,6};
        int size=arr.length;
        int k=7;
        int pos=linearSearch(arr, size, k);
        if (pos==-1) {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element is present at index: "+pos);
        }
    }
}
