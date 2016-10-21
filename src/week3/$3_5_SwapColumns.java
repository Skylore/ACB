package week3;

public class $3_5_SwapColumns {

    public static int[][] swapColumns(int[][] matrix, int height)  {

        int maxSum = 0;
        int maxIndexOfColumn = 0;
        int minSum = 0;
        int minIndexOfColumn = 0;

        for (int i = 0; i < height; i++) {
            maxSum += matrix[i][0];
        }

        for (int i = 1; i < height; i++) {

            int sum = 0;

            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }

            if (maxSum < sum) {
                maxSum = sum;
                maxIndexOfColumn = i;
            }
        }

        for (int i = 0; i < height; i++) {
            minSum += matrix[i][0];
        }

        for (int i = 1; i < height; i++) {

            int sum = 0;

            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }

            if (minSum > sum) {
                minSum = sum;
                minIndexOfColumn = i;
            }
        }

        for (int i = 0; i < height; i++) {

            int c = matrix[i][minIndexOfColumn];

            matrix[i][minIndexOfColumn] = matrix[i][maxIndexOfColumn];

            matrix[i][maxIndexOfColumn] = c;
        }

        return matrix;
    }
}
