package week3;

public class MultiplyTwoMatrix {
    public static long multiplyMatrix(int[][] mat, int[][] mat1) {

        long mult = 1;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mult *= mat[i][j];
            }
        }

        long mult1 = 1;

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mult1 *= mat1[i][j];
            }
        }

        return mult * mult1;
    }
}
