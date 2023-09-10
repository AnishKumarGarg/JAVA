public class Array2d {
    public static void main(String[] args) {

        int target = 5;
        boolean flag = false;
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    flag = true;
                    System.out.println("found at index " + i + "," + j);
                    break;
                }
            } 
        }

        if (!flag) {
            System.out.println("Not-Found i.e index " + -1 + "," + -1);
        }
    }
}
