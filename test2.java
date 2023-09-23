public class test2 {
    public static void main(String[] args) {
        String str1 = "xyz";
        char[] ch1 = str1.toCharArray();
        String str2 = "xayz";
        char[] ch2 = str2.toCharArray();
        for (int i = 0; i < ch2.length; i++) {
            if (ch1[i] != ch2[i]) {
                System.out.println(ch2[i]);
                break;
            }
        }

    }

}
