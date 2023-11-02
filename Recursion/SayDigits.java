package Recursion;

public class SayDigits {
    static void DigitsToString(int n,String[] arr){
        // Base Case
        if (n==0){
            return;
        }

        // Processing
        int digit=n%10;
        n=n/10;
        // System.out.print(arr[digit]+" "); // Head recursion

        // Recursive call
        DigitsToString(n, arr);
        System.out.print(arr[digit]+" "); // Tail recuursion
    }
    public static void main(String[] args) {
        String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int n=412;
        DigitsToString(n, arr);
    }
}
