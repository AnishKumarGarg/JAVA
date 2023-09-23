public class removeDuplicates {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("geeksforgeeks");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    str.deleteCharAt(j); // delete duplicate character
                    j--; // adjust the index after deletion
                }
            }
        }

        System.out.println(str); 
    }
}
