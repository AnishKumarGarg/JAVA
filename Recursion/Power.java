public class Power {
    static int power(int a,int b){
        // Base Case
        if (b==0) {
            return 1;
        }
        if (b==1){
            return a;
        }

        // Recursive Case
        int ans=a*power(a, b-1);
        return ans;

        // if (b%2==0) {
        //     // if b is even
        //     return ans*ans;
        // }
        // else{
        //     // if a is odd 
        //     return a*ans*ans;
        // }
    }
    public static void main(String[] args) {
        System.out.println(power(99, 123));
    }
}
