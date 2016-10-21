package week3;

public class $3_1 {
    public static void main(String[] args) {

        int height = Intro.height();
        int width = Intro.width();

        int matrix[][] = GenerateMatrix.matrix(height, width);

        System.out.println("Default matrix: ");

        PrintMatrix.printMat(matrix);

        System.out.println("\nChanged matrix: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = matrix[i][j] % 5 == 0 ? 8 : matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
