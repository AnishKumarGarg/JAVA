public class TrimSpaces {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc d efgh");
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i)==' ') {
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }
    
}
