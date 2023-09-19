import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        if(x>y){
            System.out.println(x+" is greater than "+y);
        }
        else{
            System.out.println(y+" is greater than "+x);
        }
        System.out.println();

        scanner.close();
    }
}
