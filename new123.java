import java.util.*;

public class new123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int[][] jaggedArray = new int[row][];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter size of col for each row");
            int col = sc.nextInt();

            // initilize array at each row
            jaggedArray[i] = new int[col];

            for (int j = 0; j < col; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(jaggedArray[i]));
        }
    }
}
