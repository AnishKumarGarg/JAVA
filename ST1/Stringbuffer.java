public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" World Yo");
        sb.insert(2,"My");
        sb.replace(2,4,"KRK");
        sb.delete(2,4);
        sb.reverse();
        sb.charAt(3);
        System.out.println(sb);

    }
}
