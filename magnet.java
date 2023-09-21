
public class magnet {
    public static void main(String[] args) {
        int diff = 0;
        int max = Integer.MIN_VALUE;
        int arr[]={4,2,1,3,6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                diff=Math.abs(arr[j]-arr[i]);
                if(diff > max){
                    max = diff;
                }
            }
        }
        System.out.println(max);
    }
}
