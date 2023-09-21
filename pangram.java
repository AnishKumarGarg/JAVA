public class pangram {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(sentence);
        
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean checkPangram(String sentence) {
        sentence = sentence.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }

        return true;
    }
}
