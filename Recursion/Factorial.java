package Recursion;
public class Factorial {
    // 5!=5*4*3*2*1 --> 5*4!
    // 4!=4*3!
    // 3!=3*2!
    // 2!=2*1!
    // 1!=1*0!
    // 0!=1 --> Base case --> Where you gotta stop
    // Henceforth f(n)=n*f(n-1)

    // Recursion wahan par use karte hain jahan par ek badi problem ko chhoti problem me break kar sakein 

    static int factorial(int n){        
        // Base Case
        if (n==0) {
            return 1;
        }
        int factorial=n*factorial(n-1);
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
