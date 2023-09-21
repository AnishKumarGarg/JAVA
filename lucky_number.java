public class lucky_number {
    static boolean lucky(int n,int k){
        if (n<k) {
            return true;
        }
        if(n%k==0){
            return false;
        }
        else {
            return lucky(n-(n/k),k+1);
        } 
    }

    public static void main(String[] args) {
        //int[] arr={1,2,3,4,5,6};
       // int size=6;
        //int n=3;
        if (lucky(15 , 2)) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
