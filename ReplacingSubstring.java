public class ReplacingSubstring {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello! Hello! Hello!");
        String target = "Hello";

        for (int i = 0; i <= sb.length() - target.length(); i++) {
            if (sb.substring(i, i + target.length()).equals(target)) {
                sb.replace(i, i + target.length(), "hi");
            }
        }

        System.out.println(sb);
    }
}
