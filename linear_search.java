import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
                // flag=true;
                System.out.println(i);
                break;
            }
            // else{
            //     // flag=false;
            // }
        }

        // if(flag=true){
        //     System.out.println(i);
        // }
        // else{
        //     System.out.println("not found");
        // }
    }
}
