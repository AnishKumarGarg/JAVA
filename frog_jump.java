public class frog_jump {
    static boolean canWin(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1) {
            return false;
        }
        if (i >= game.length - 1 || i + leap >= game.length - 1) {
            return true;
        }

        game[i] = 1;

        return canWin(leap, game, i + 1) || canWin(leap, game, i - 1) || canWin(leap, game, i + leap);
    }

    public static void main(String[] args) {
        int[] game = { 0, 0, 1, 1, 1, 0 };
        int leap = 3;
        System.out.println(canWin(leap, game, 0));
            
        }
    }
