package Recursion;

public class Fibonacci {
    static int printFib(int n){
        // Base Case
        if(n==0){
            return 0;
        }
        if (n==1) {
            return 1;
        }
        return printFib(n-1)+printFib(n-2);
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(printFib(n));
    }
}
