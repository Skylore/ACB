package week3;

public class $3_5_SwapLines {
    public static int[][] swapLines(int[][] matrix, int height)  {
        //sum of first line
        int maxSum = 0;
        int indexOfBiggestLine = 0;

        for (int i = 0; i < matrix.length; i++) {
            maxSum += matrix[0][i];
        }

        for (int i = 1; i < height; i++) {

            int sum = 0;

            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }

            if (maxSum < sum) {
                maxSum = sum;

                indexOfBiggestLine = i;
            }
        }

        int indexOfSmallestLine = 0;

        for (int i = 0; i < matrix.length; i++) {
            maxSum += matrix[0][i];
        }

        for (int i = 1; i < height; i++) {

            int sum = 0;

            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }

            if (maxSum > sum) {
                maxSum = sum;

                indexOfSmallestLine = i;
            }
        }

        int c[] = matrix[indexOfBiggestLine];
        matrix[indexOfBiggestLine] = matrix[indexOfSmallestLine];
        matrix[indexOfSmallestLine] = c;

        return matrix;
    }
}
