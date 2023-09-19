public class Capitalize {
    public static void main(String[] args) {
        String str="the quick brown fox";
        String[] words=str.split(" ");
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char firstLetter=Character.toUpperCase(words[i].charAt(0));
            String restWord=words[i].substring(1);
            result.append(firstLetter).append(restWord).append(" ");

        }
        System.out.println(result);
    }
}
