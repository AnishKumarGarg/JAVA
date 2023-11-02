
public class Sum {
    static int FindSum(int arr[],int size){
        // Base Cases
        if (size==0) {
            return 0;
        }
        if (size==1) {
            return arr[0];
        }
        
        // Recursive Case
        int sum=arr[size-1]+FindSum(arr, size-1); 
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={3,2,5,1,6};
        int size=arr.length;
        System.out.println(FindSum(arr, size));
    }
}
