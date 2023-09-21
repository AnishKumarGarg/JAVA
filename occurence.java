public class occurence {
    public static void main(String[] args) {
        String str = "kamlaafokamla";
        String searchStr = "kamla";
        int count = 0;

        for (int i = 0; i <= str.length() - searchStr.length(); i++) {
            if (str.substring(i, i + searchStr.length()).equals(searchStr)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
