// public class RotateString {
//     public static void main(String[] args) {
//         StringBuilder str=new StringBuilder("CodingNinjas");
//         int n = 3; // number of characters to rotate right
//         StringBuilder rotatedStr=new StringBuilder(str.substring(str.length()-n)+str.substring(0, n))
//         System.out.println(rotatedStr);

//     }
// }
public class RotateString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("CodingNinjas");
        
        int rotationCount = 3;
        for (int i = 0; i < rotationCount; i++) {
            char lastChar = sb.charAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, lastChar);
        }
        
        System.out.println(sb);
}
}
