import java.util.Arrays;
public class StringInArray {
    public static void main(String[] args){
        String s="Hello world";
        int len=s.length();
        char[] arr=new char[len];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
