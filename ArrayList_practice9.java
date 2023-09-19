import java.util.*;
public class ArrayList_practice9 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Tanmay Bhat");
        list.add("Scout");
        list.add("Mortal");
        list.add("Samay Raina");
        list.add("Gamerfleet");
        list.add("Carry Minati");

        int count=0; 
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()>6) {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
