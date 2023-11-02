package Recursion;

public class ClimbStairs {
    static int countWays(int n){
        if (n==0) {
            return 1;
        }
        if (n<0) {
            return 0;
        }
        int ans=countWays(n-1)+countWays(n-2);
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(countWays(5));
    }
}
