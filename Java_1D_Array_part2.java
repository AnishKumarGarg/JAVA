import java.util.*;

public class Java_1D_Array_part2 {

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(game, leap, 0);
    }

    static boolean isSolvable(int[] game, int leap, int i) {
        if (i < 0 || game[i] == 1) {
            return false;
        }
        if (i >= game.length - 1 || i + leap >= game.length) {
            return true;
        }

        game[i] = 1;

        return isSolvable(game, leap, i + leap) ||
               isSolvable(game, leap, i + 1) ||
               isSolvable(game, leap, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

        // int leap = 3;
        // int[] game = {0, 0, 1, 1, 1, 0};

        System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
        scan.close();
    }
}
