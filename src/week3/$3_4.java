package week3;

import java.util.Scanner;

public class $3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input height of matrix ");
        int height = scanner.nextInt();

        System.out.println("Input width of matrix ");
        int width = scanner.nextInt();

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