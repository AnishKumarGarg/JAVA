package Recursion;

public class PowerOf2 {
    // 2^5=2*2^4
    // 2^4=2*2^3
    // 2^3=2*2^2
    // 2^2=2*2^1
    // 2^1=2*2^0
    // 2^0=1 --> Yahan Rukna hai
    // Henceforth f(n)=2*f(n-1)

    static int powerOf2(int n){
        if(n==0){
            return 1;
        }
        int ans=2*powerOf2(n-1);
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(powerOf2(n));
    }
}
