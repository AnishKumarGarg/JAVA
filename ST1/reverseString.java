import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        String str="My name is Khan";
        char[] charArr=str.toCharArray();
        for(int i=charArr.length-1;i>=0;i--){
            System.out.print(charArr[i]);
        }
        StringBuilder s = new StringBuilder(str);
        System.out.println(s.reverse());
        

        String s_ans="";
        StringTokenizer s2 = new StringTokenizer(str," ");
        while(s2.hasMoreTokens()){
            StringBuilder temp = new StringBuilder(s2.nextToken());
            s_ans+=temp.reverse()+" ";
        }
        System.out.println(s_ans);
    }
}
