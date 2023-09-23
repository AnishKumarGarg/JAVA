public class StringJoin {
    public static void main(String[] args) {
        String str="Hello World!";
        String substring1=str.substring(0, 5); 
        String substring2=str.substring(6); 
        String JoinedString=String.join(".",substring1,substring2);
        System.out.println(JoinedString);
        
    }
}
