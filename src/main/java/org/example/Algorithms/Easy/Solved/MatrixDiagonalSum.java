package main.java.org.example.Algorithms.Easy.Solved;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0, j = 0; i < mat.length; i++, j++) {
            sum += mat[i][j];
        }
        for (int i = 0, j = mat.length - 1; i < mat.length; i++, j--) {
            if (i == (mat.length - 1) / 2 && (mat.length - 1) % 2 == 0) {
                continue;
            }
            sum += mat[i][j];
        }
        return sum;
    }
}
