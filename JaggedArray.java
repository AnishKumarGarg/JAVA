import java.util.*;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 3;
        int[][] jaggedArray = new int[3][];
        for (int i = 0; i < row; i++) {
            int col = scanner.nextInt();
            jaggedArray[i] = new int[col];
            for (int j = 0; j < col; j++) {
                jaggedArray[i][j] = scanner.nextInt();

            }
        }
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(jaggedArray[i]));

        }
    }
}
