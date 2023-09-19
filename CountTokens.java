import java.util.*;
public class CountTokens {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("Koi mujhko yoon mila hai jaise banjaare ko ghar");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
