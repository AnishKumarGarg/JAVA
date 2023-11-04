public class CheckPalindrome {
    static boolean isPalindrome(String str,int start,int end){
        // Base Case
        if (start>=end) {
            return true;
        }
        if (str.charAt(start)!=str.charAt(end)) {
            return false;
        }

        //Recursive Case
        return isPalindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        String str="abbcbba";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
