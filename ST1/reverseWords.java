public class reverseWords {
    public static void main(String[] args) {
        String str="My name is Khan";
        String[] stringArray=str.split(" ");
        for (int i = stringArray.length-1; i >= 0; i--) {
            System.out.print(stringArray[i]+" ");
        }
    }
}
