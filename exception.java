public class exception {
    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 3, 4, 5 };
            System.out.println(arr[10]);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Sahi code likh bhosdiwale");
        } finally {
            System.out.println("'Try...catch' block finished");
        }
    }
}
