import java.util.*;
public abstract class ArrayList_practice3 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        Collections.sort(colors);
        System.out.println(colors);
    }
}
