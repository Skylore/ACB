package week3;

import java.util.Scanner;

public class $3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input size of first matrix: \nwidth");
        int width = scanner.nextInt();

        System.out.println("Height");
        int height = scanner.nextInt();

        System.out.println("Input size of second matrix: \nWidth");
        int width1 = scanner.nextInt();

        System.out.println("Height");
        int height1 = scanner.nextInt();

        System.out.println("First matrix: ");

        int mat[][] = GenerateMatrix.matrix(height, width);

        PrintMatrix.printMat(mat);

        System.out.println("Second matrix: ");

        int mat1[][] = GenerateMatrix.matrix(height1, width1);

        PrintMatrix.printMat(mat1);

        System.out.println("Multiply is: ");

        long multiply = MultiplyTwoMatrix.multiplyMatrix(mat, mat1);

        System.out.println(multiply);
    }
}
