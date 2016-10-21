package week3;

public class $3_4 {
    public static void main(String[] args) {

        int height = Intro.height();
        int width = Intro.width();

        int matrix[][] = GenerateMatrix.matrix(height, width);
        int mas[] = matrix(height, width, matrix);

        PrintMatrix.printMat(matrix);

        System.out.println("\nDiagonal of matrix is: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public static int[] matrix(int height, int width, int mat[][]) {


        int mas[] = new int[height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (mat[i] == mat[j]) {
                    mas[i] = mat[i][j];
                }
            }
        }

        return mas;
    }
}