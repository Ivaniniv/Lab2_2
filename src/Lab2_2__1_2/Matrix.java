package Lab2_2__1_2;

/**
 * Created by Alex on 15.02.2016.
*/
public class Matrix {
    private final static int ROW = 3;
    private final static int COL = 3;
    private int[][] matrix = new int[ROW][COL];

    public final int[][] getMatrix() {
        return matrix;
    }

    public final void setMatrix() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                matrix[i][j] = ((int) (Math.random() * 10));
            }
        }
    }

    public final void addition(int[][] arr1, int[][] arr2) {
        int[][] result = new int[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++)
                result[i][j] = arr1[i][j] + arr2[i][j];
        }
        matrix = result;
    }

    public final void multiplication(int[][] arr1, int[][] arr2) {
        int[][] result = new int[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                int multiplication = 0;
                for (int r = 0; r < arr1.length; r++) {
                    multiplication += arr1[i][r] * arr2[r][j];
                }
                result [i][j] = multiplication;
            }
            matrix = result;
        }
    }

    public String toString() {
        String arrayToString = "";
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (matrix[i][j] > 10) arrayToString += (matrix[i][j] + " ");
                else arrayToString += (matrix[i][j] + "  ");
            }
            arrayToString += "\n";
        }
        return arrayToString;
    }
}
