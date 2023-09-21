public class nestedfor {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer: " + i);
            for (int j = i; j < 3; j++) {
                System.out.println("  Inner: " + j);
            }
        }
    }
}
