public class ChangeCase {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("anish");
        System.out.println(sb.toString().toUpperCase());

        StringBuilder sb1=new StringBuilder("ANISH");
        System.out.println(sb1.toString().toLowerCase());
    }
}
