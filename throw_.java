public class throw_ {
    public static void main(String[] args) {
        System.out.println(divide(6, 0));
    }
    static int divide(int a, int b){
        if(a==0 || b==0){
            throw new ArithmeticException("Cant divide by zero give other number");
        }
        else{
            return a/b;
        }
    }

}
