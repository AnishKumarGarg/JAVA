public class nestedfor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop: " + i);
            for (int j = 0; j < i; j++) {
                System.out.println("    Inner loop: " + j);
            }
        }
    }
}
