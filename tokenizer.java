import java.util.*;

public class tokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My,name,is,Khan");
        int tokenCount = 0;
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken(","));
            tokenCount += 1;
        }
        System.out.println(tokenCount);

    }
}
