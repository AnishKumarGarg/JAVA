package Recursion;

public class counting {
    static void PrintCount(int n) {
        // Base Case
        if (n == 0) {
            System.out.println(0);
            return;
        }
        // System.out.println(n+" ");  // Head Recursion

         PrintCount(n - 1);  

        System.out.println(n + " "); // Tail Recursion
    }

    public static void main(String[] args) {
        PrintCount(5);
    }
}
