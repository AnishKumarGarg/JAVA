public class Aanya {
    public static void main(String[] args) {
        try {
            System.out.println("Submit");
            throwit();
        } catch (Exception e) {
            // TODO: handle exception
            // System.out.println("Caught");
            throw new ArrayIndexOutOfBoundsException(4);
        } finally {
            System.out.println("This is finally block");
        }
    }

    static void throwit() {
        throw new RuntimeException("This is throwit method");
    }
}
