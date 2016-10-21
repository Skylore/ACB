package week3;

public class GenerateMatrix {

    public static int[][] matrix(int height, int width) {

        int matrix[][] = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = ((int) (100 * Math.random()));
            }
        }

        return matrix;
    }
}
