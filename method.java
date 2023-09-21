public class method {
    public static void main(String[] args) {
        hello_int();
        hello_void();
    }
    static void hello_void(){
        System.out.println("This is int function");

    }
    static int hello_int(){
        System.out.println("This is void function");
        return 0;
    }
}
