public class ReverseString {

    static String Reverse(String str, int start, int end) {
        // Base Case
        if (start >= end) {
            return str;
        }

        str=swap(str, start, end); // Process and update str

        // Recursive Case
        return Reverse(str, start + 1, end - 1);
    }

    static String swap(String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "Anish";
        int start = 0;
        int end = str.length() - 1;
        System.out.println(Reverse(str, start, end));
    }
}
