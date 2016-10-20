package week3;

import java.util.Scanner;

public class $3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input height of matrix ");
        int height = scanner.nextInt();
        System.out.println("Input width of matrix ");
        int width = scanner.nextInt();

        int matrix[][] = fillMatrix(height, width);

        System.out.println("Default matrix: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nChanged matrix: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = matrix[i][j] % 5 == 0 ? 8 : matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] fillMatrix(int height, int width) {
        int mat[][] = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                mat[i][j] = ((int) (Math.random() * 100));
            }
        }

        return mat;
    }
}
