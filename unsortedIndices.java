import java.util.Arrays;

public class unsortedIndices {
    public static void main(String[] args) {
        int[] arr = {1,5,7,33,6};
        int[] cpyarr = Arrays.copyOf(arr,arr.length);

        Arrays.sort(cpyarr);
        // System.out.println(Arrays.toString(cpyarr));

        for (int i = cpyarr.length-1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if(cpyarr[i] == arr[j]){ 
                    System.out.print(j+" ");
                }
            }
        }
    }
}
