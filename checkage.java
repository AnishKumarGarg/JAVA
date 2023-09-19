public class checkage {
    public static void main(String[] args) {
        age(20);
    }
    static int age(int age){
        if(age<18){
            System.out.println("Access denied");
        }
        else{
            System.out.println("Access granted");
        }
        return 1;
    }
}
